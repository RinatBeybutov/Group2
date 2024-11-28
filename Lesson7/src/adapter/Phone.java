package adapter;

public class Phone {

    private OldMediaPlayer player;

    public Phone(OldMediaPlayer player) {
        this.player = player;
    }

    public void play(String fileName) {
        player.playWav(fileName);
        player.playMp4(fileName);
    }

    public void setPlayer(OldMediaPlayer player) {
        this.player = player;
    }
}
