package adapter;

public class Main {
    public static void main(String[] args) {

        // Это наш старый телефон, мы можем вызывать только методы OldMediaPlayer
        OldMediaPlayer oldMediaPlayer = new OldMediaPlayer();

        Phone phone = new Phone(oldMediaPlayer);

        phone.play("beyond the horizon.mp4");
        phone.play("beyond the horizon.wav");


        System.out.println("-----------------");

        NewMediaPlayer newMediaPlayer = new NewMediaPlayer();
        AdapterMediaPlayer adapter = new AdapterMediaPlayer(newMediaPlayer);

        phone.setPlayer(adapter);

        phone.play("beyond the horizon.mp4");
        phone.play("beyond the horizon.wav");

    }

}
