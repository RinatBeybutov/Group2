package adapter;

public class NewMediaPlayer {

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("wav")) {
            System.out.println("Playing wav file. Name: " + fileName);
        }
    }
}
