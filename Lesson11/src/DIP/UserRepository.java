package DIP;

public class UserRepository {

    private Logger logger;

    public UserRepository(Logger logger) {
        this.logger = logger;
    }

    public void addUser(String  user) {
        logger.log("Adding user: " + user);
    }
}
