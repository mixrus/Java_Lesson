package lesson6;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal cat = new Cat();

        dog.run(150);
        cat.run(5000);

        dog.jump(10);
        cat.jump(11);

        dog.swim(3);
    }
}
