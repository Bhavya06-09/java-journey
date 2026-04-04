import java.util.Scanner;
class BookNotFoundException extends Exception {
    BookNotFoundException(String book) {
        super("Book '" + book + "' not found in library");
    }
}
public class LibraryDemo {
    static String[] books = {"Java Basics", "OOP Guide", "Data Structures", "File IO", "Exceptions"};
    static boolean[] issued = {false, false, true, false, false};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Library Management System");
        while(true) {
            menu();
            try {
                int choice = sc.nextInt();
                sc.nextLine();
                
                if(choice == 1) issueBook(sc);
                else if(choice == 2) returnBook(sc);
                else if(choice == 3) showBooks();
                else if(choice == 0) {
                    System.out.println("Goodbye");
                    break;
                }
            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
        sc.close();
    }
    static void menu() {
        System.out.println("1. Issue Book  2. Return Book  3. Show Books  0. Exit");
        System.out.print("Choose: ");
    }
    static void issueBook(Scanner sc) throws BookNotFoundException {
        System.out.print("Book name: ");
        String bookName = sc.nextLine().trim();
        for(int i=0; i<books.length; i++) {
            if(books[i].equalsIgnoreCase(bookName)) {
                if(issued[i]) {
                    System.out.println(bookName + " already issued");
                } else {
                    issued[i] = true;
                    System.out.println(bookName + " issued successfully");
                }
                return;
            }
        }
        throw new BookNotFoundException(bookName);
    }
    static void returnBook(Scanner sc) {
        try {
            System.out.print("Book ID (1-5): ");
            int id = Integer.parseInt(sc.nextLine()) - 1;
            if(id < 0 || id >= books.length) {
                System.out.println("Invalid Book ID: " + (id+1));
                return;
            }
            if(issued[id]) {
                issued[id] = false;
                System.out.println("Returned: " + books[id]);
            } else {
                System.out.println(books[id] + " not issued");
            }
        } catch(NumberFormatException e) {
            System.out.println("Enter valid number for Book ID");
        }
    }
    static void showBooks() {
        System.out.println("Library Books:");
        for(int i=0; i<books.length; i++) {
            String status = issued[i] ? "Issued" : "Available";
            System.out.println((i+1) + ". " + books[i] + " [" + status + "]");
        }
    }
}