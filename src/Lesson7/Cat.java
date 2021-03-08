package Lesson7;

class Cat {
    private String name;
    private int appetite;
    private boolean fed; //Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны)
    // как мы знаем boolean default false и не будем производить инициализацию

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        fed = plate.decreaseFood(appetite);
    }

    public void info() {
        System.out.println(name + " " + (fed ? " сыт " : " голоден "));
    }
}
