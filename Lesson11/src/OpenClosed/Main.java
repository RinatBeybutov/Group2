package OpenClosed;

public class Main {
    public static void main(String[] args) {

        //Cat cat = new CatProxyLogger();
        //cat.meow();

        UserRepositoy userRepositoy = new UserRepositoryRedis();

        userRepositoy.getUser();
    }
}
