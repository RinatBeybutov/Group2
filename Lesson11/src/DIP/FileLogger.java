package DIP;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Вывожу сообщение в файл!");
    }
}
