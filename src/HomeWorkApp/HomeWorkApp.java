package HomeWorkApp;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    //Задание2
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    //Задание3
    public static void checkSumSign() {
        int a = 1;
        int b = 1;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
            //Задание4
        public static void printColor() {
            int value = 99;

            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 & value <= 100) {
                System.out.println("Желтый");
            } else if (value > 100) {
                System.out.println("Зеленый");
                }
        }
        //Задание5
        public static void compareNumbers() {
        int a = 1;
        int b = 2;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


    }
