class Typewriter extends Thread{
    private String poem;
    Typewriter(String p) { 
        poem =p;
    }
    public void run() 
    {
        for(int i=0; i<poem.length(); i++){
            System.out.print(poem.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}