import java.util.Objects;

public class Main {
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Main main)) return false;
        return id == main.id && Objects.equals(name, main.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.setId(10);
        obj.setName("Vaibhav");


        System.out.println(obj);
        System.out.println(obj);
        Main main = new Main();
        System.out.println(main);

        Demo demo = obj;
        demo.setId(11);
        demo.setName("Vaibhav");
        System.out.println("obj.equals(main) = " + obj.equals(main));

        System.out.println("demo = " + demo);
        System.out.println("obj = " + obj);
    }

}
