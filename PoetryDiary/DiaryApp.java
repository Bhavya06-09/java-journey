import java.util.Scanner;
class HappyPoem extends DiaryEntry {
    HappyPoem(String title, String mood) {
        super(title, mood);
    }
    void writeEntry() {
        super.writeEntry();
        System.out.println("Light flows through words");
    }
}
public class DiaryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Poem title: ");
        String title = sc.nextLine();
        System.out.print("Mood (sad/happy): ");
        String mood = sc.nextLine();
        DiaryEntry today;
        if(mood.equalsIgnoreCase("sad")) {
            today = new SadPoem(title, mood);
        } else {
            today = new HappyPoem(title, mood);
        }
        System.out.println("\n--- My Diary ---");
        today.writeEntry();
        sc.close();
    }
}