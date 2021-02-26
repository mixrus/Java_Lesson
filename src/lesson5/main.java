package lesson5;
class personal {
    //* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    String fullname;
    String position;
    String email;
    String telefon;
    double salary;
    int age;
    personal (String fullname, String position, String email, String telefon, double salary, int age){
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        if(age >= 18){
            this.age = age;
        } else {
            System.out.println("Возрастр не может быть меньше 18 лет");
        }
    }
    int GetAge(){
        return age;
    }
    void send(){
        System.out.println(fullname + " " + position + " " +  email + " " + telefon + " " + salary + " " + age);
    }
}

public class main {
    public static void main(String[] args) {
        personal[] persArray = new personal[5]; // Вначале объявляем массив объектов
        persArray[0] = new personal("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new personal("Aleandra Sentiou", "Accountant", "Sentiou@mailbox.com", "894575841", 50000, 40);
        persArray[2] = new personal("Aurora Beilock", "Manager", "Beilock@mailbox.com", "892234578", 40000, 30);
        persArray[3] = new personal("Risha Raven", "Secretary", "Raven@mailbox.com", "892137852", 20000, 25);
        persArray[4] = new personal("Anna Snow", "Chief", "Snow@mailbox.com", "895469414", 60000, 40);
        for(personal item : persArray){
            if (item.GetAge() >= 40) item.send();
        }
    }
}
