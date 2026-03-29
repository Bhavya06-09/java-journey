class DiaryEntry {
    String poemTitle;
    String mood;
    DiaryEntry(String title, String mood) {
        this.poemTitle = title;
        this.mood = mood;
    }
    void writeEntry() {
        System.out.println("Poem: " + poemTitle);
        System.out.println("Mood: " + mood);
    }
}