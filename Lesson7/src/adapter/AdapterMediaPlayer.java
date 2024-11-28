package adapter;

public class AdapterMediaPlayer extends OldMediaPlayer {

    private NewMediaPlayer newMediaPlayer;

    public AdapterMediaPlayer(NewMediaPlayer newMediaPlayer) {
        this.newMediaPlayer = newMediaPlayer;
    }

    @Override
    public void playWav(String fileName) {
        newMediaPlayer.play("wav", fileName);
    }

    @Override
    public void playMp4(String fileName) {
        newMediaPlayer.play("mp4", fileName);
    }
}
