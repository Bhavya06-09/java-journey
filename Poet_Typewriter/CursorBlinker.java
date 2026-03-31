class CursorBlinker extends Thread {
    private int times;
    
    CursorBlinker(int t) { times = t; }
    
    public void run() {
        for(int i=0; i<times; i++) {
            System.out.print(" ");
            try {
                sleep(300);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}