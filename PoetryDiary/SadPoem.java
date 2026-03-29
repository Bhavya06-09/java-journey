class SadPoem extends DiaryEntry {
    SadPoem(String title, String mood) {
        super(title, mood);
    }
    void writeEntry() {
        super.writeEntry();
        System.out.println("Heavy heart writing");
    }
}