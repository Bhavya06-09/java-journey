public class PoetTypewriter {
    public static void main(String[] args) {
        System.out.println("Typewriter warming up...\n");
        Typewriter poem = new Typewriter("She'll always be with you," + "\n" + "Through highs and the lows." + "\n" + "The moon is by your side," + "\n" + "Wherever you may Go." + "\n" + "Children of the MOON," + "\n" + "My mother would say," + "\n" + "Glowing each night," + "\n" + "Still there at the day.");
        CursorBlinker cursor = new CursorBlinker(20);
        poem.start();
        cursor.start();
        System.out.println("\nPoem complete.");
    }
}