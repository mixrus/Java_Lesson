import java.util.Scanner;

public class Lesson4 {
    private static final char X = 'X';
    private static final char O = 'O';
    private static final char DEFAULT = '_';
    private static final char DELIMITER = '|';
    private static char[][] MAP;
    private static int steps = 0;
    private static int size;

    private static void numberFields() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество стобцов для старта игры ");
        int pole = in.nextInt();
        if (pole >= 3) {
            MAP = new char[pole][pole];
            size = pole;
        } else {
            System.out.println("Слишком мало столбцов");
            numberFields();
        }
    }

    private static void fillMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                System.out.print(DELIMITER + "" + MAP[i][j]);
            }
            System.out.println(DELIMITER);
        }
    }

    private static void game() {
        steps = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Делайте ваш ход:");
            int x = in.nextInt(), y = in.nextInt();
            x--;
            y--;
            if (validInput(x, y)) {
                MAP[x][y] = X;
                steps++;
                if (isWin(X)) {
                    System.out.println("Вы победили!");
                    printMap();
                    return;
                }
                if (steps == MAP.length * MAP.length) {
                    System.out.println("Ничья!");
                    return;
                }
                movePC();
                if (isWin(O)) {
                    System.out.println("Вы проиграли!");
                    return;
                }
            } else {
                System.out.println("Неверный ход! Будте повнимательней");
            }
            printMap();
        }
    }

    private static void movePC() {
        int x, y;
        do {
            x = (int) (Math.random() * MAP.length);
            y = (int) (Math.random() * MAP.length);
        } while (!validInput(x, y));
        MAP[x][y] = O;
        steps++;
    }

    private static boolean isWin(char x) {
//        for (int i = 0; i < 3; i++) {
//            if ((MAP[i][0] == x && MAP[i][1] == x && MAP[i][2] == x)
//                    || (MAP[0][i] == x && MAP[1][i] == x && MAP[2][i] == x))
//                return true;
//            if ((MAP[0][0] == x && MAP[1][1] == x && MAP[2][2] == x)
//                    || (MAP[2][0] == x && MAP[1][1] == x && MAP[0][2] == x))
//                return true;
//        }
//        return false;
//    }
        int poleVer = 0;
        int poleHor = 0;
        int poleDiaA = 0;
        int poleDiaB = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (MAP[i][j] == X) {
                    poleVer++;
                    if (poleVer == size) return true;
                }
                if (MAP[j][i] == X) {
                    poleHor++;
                    if (poleHor == size) return true;
                }
            }
            if (MAP[i][i] == X) {
                poleDiaA++;
                if (poleDiaA == size) return true;
            } else poleDiaA = 0;
            if (MAP[i][size - 1 - i] == X) {
                poleDiaB++;
                if (poleDiaB == size) return true;
            } else poleDiaB = 0;
        }
        return false;
    }


    private static boolean validInput(int x, int y) {
        boolean inMap = x >= 0 && y >= 0 && x < MAP.length && y < MAP.length;
        return inMap && MAP[x][y] == DEFAULT;
    }

    public static void main(String[] args) {
        System.out.println("Вы в игре 'Крестики Нолики'");
        System.out.println("На каждом ходу вы вводите два числа: номер строки и номер столбца");
        numberFields();
        fillMap();
        printMap();
        game();
    }
}


