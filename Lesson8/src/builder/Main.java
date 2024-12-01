package builder;

public class Main {
    public static void main(String[] args) {

        Person person = Person.builder()
                .address("Moscow")
                .age(20)
                .name("Ivan")
                .build();

        System.out.println(person);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("My");
        stringBuilder.append(" name ");
        stringBuilder.append("is ");
        stringBuilder.append("Ivan");

        String string = stringBuilder.toString();
        System.out.println(string);

    }
}