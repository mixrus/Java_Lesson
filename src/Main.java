import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    //№ 3
    public static void NumberThree() {
        float a = 5, b = 15, c = 20, d = 10;
        float e = a * (b + (c / d));
        System.out.println("Задание № 3");
        System.out.println("a * (b + (c / d)) = " + e);
        System.out.println("*******");
    }
    //Конец № 3
    //№ 4
    public static void NumberFour(){

        System.out.println("Задание № 4");
        System.out.println("Введите два числа:");
        int g = in.nextInt() , f = in.nextInt() ;
        int h = g + f;
        if ( h >= 10 && h <= 20) {
            System.out.println("True");
        } else {
            System.out.println("FalseFalse");
        }
        System.out.println("*******");
    }
    //Конец № 4
    //№ 5
    public static void NumberFive() {
        System.out.println("Задание № 5");
        System.out.println("Введите число:");
        int i = in.nextInt();
        if ( i >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        System.out.println("*******");
    }
    //Конец № 5
    //№ 6
    public static void NumberSix(){
        System.out.println("Задание № 6");
        System.out.println("Введите число:");
        int j = in.nextInt();
        if ( j >= 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("*******");
    }
    //Конец № 6
    //№ 7
    public static void NumberSeven(){
        System.out.println("Задание № 7");
        System.out.println("Введите имя");
        String k = in.next();
        System.out.println("Ваше имя: "+k);
        System.out.println("*******");
    }

    //Конец № 7
    //№ 8
    public static void NumberNine(){
        System.out.println("Задание № 8");
        System.out.println("Введите год");
        int year = in.nextInt();
        if(year % 4 == 0 || year % 100 != 0 || year % 400 == 0){
            System.out.println("Год високосный");
        } else {
            System.out.println("Обычный");
        }
        System.out.println("*******");
    }
    //Конец № 8

    public static void main(String[] args) {
        //№ 2
        int intVal = 12;
        float floatVal = 12.00f;
        byte byteVal = 120;
        short shortVal = 12000;
        long longVal = 120000L;
        double doubleVal = 120.120;
        char charVal = 'T';
        boolean booleanVal = false;
        //Конец № 2
        NumberThree();
        NumberFour();
        NumberFive();
        NumberSix();
        NumberSeven();
        NumberNine();

        in.close();

    }
}
