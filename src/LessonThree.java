package com.company;

import java.util.Scanner;

public class LessonThree {
    private static Scanner scanner_privat = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вы зашли в игру <<Угадай число>>");
        play_level_1();
        scanner_privat.close();
    }
    private static void play_level_1 (){
        int i = 9;
        int round = 0;
        int number = (int) (Math.random() * i);
        while ( round < 3){
            System.out.println("Угадайте число от 0 до " +i);
            int input_number = scanner_privat.nextInt();
            if (input_number == number){
                System.out.println("Вы угадали число: " + number);
                System.out.println("Вы  победили!!!");
                break;
            } else if (input_number > number){
                System.out.println("Загаданное число меньше: " + input_number);
            } else {
                System.out.println("Загаданное число больше: " + input_number);
            }
            round++;
        }
        System.out.print("К сожалению, ваши попытки закончились. Начать игру заново? Да? жми 1; Нет? нажми 0:");

        String userData = scanner_privat.next();
        if(userData.equals("1")) {
            main(null);
        }
    }

}