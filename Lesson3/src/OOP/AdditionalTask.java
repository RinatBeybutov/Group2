package OOP;

public class AdditionalTask {
    /**
     * Создать класс OOP.Human, у которого будут поля:
     * String name
     * String lastName
     * int age
     *
     *
     *
     * Все поля должны быть с модификатором - private
     *
     * Будет два конструктора - один пустой, второй - полный (инициализирует все поля)
     * ***
     * Создать класс Main, в котором будет создаваться массив размерностью -3.
     * После инициализации массива - заполнить его объектами класса OOP.Human
     * (Объекты создавать с помощью конструктора который принимает все поля класса,
     * значения на ваше усмотрение).
     * После этого - отсортировать массив по возрасту и вывести результат в консоль.
     */
    public static void main(String[] args) {
        Human[] humans = new Human[4];
        humans[0] = new Human("Ivan", "Ivanov", 20);
        humans[1] = new Human("Petr", "Petrov", 25);
        humans[2] = new Human("Sidor", "Sidorov", 15);
        humans[3] = new Human("Sidor", "Sidorov", 10);

        sort(humans);

        for (Human human : humans) {
            System.out.println(human);
        }
    }

    private static void sort(Human[] humans) {
        for (int i = 0; i < humans.length - 1; i++) {
            for (int j = 0; j < humans.length - i - 1; j++) {
                if (humans[j].getAge() < humans[j + 1].getAge()) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
    }
}
