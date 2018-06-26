public class Dog {
    int size;
    String breed;
    String name;
    int speed;

    void bark () {
        System.out.println("Bark! Bark!");
        System.out.println(name);
    }

    void run () {
        System.out.println(name + " run " + speed + " k/h ");
    }
}
