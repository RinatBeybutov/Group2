package DIP;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository(new FileLogger());
    }
}
