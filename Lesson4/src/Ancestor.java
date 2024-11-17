public class Ancestor {

    private String name;

    protected String protectedName;

    private final int finalAge;

    private final String finalName;

    public Ancestor(int finalAge, String finalName) {
        this.finalAge = finalAge;
        this.finalName = finalName;
    }


    public void print() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
