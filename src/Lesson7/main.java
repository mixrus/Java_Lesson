package Lesson7;

public class main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 70),
                new Cat("Sharik", 25),
                new Cat("Mursik", 18),
        };
        Plate plate = new Plate(100);
        for (Cat itemCat : cats) {
            itemCat.eat(plate);
            itemCat.info();
        }

    }
}