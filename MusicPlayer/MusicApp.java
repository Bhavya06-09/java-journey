public class MusicApp{
    public static void main(String[] args) {
        Playable player = new MP3Player();
        player.play();
        player.stop();
    }
}