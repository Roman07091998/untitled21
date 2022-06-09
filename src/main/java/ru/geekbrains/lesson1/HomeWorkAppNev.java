package ru.geekbrains.lesson1;

public class HomeWorkAppNev {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        //2 задание
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //3 задание
    public static void checkSumSign() {
        int a = 10;
        int b = 5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
        }
        //4 задание
        public static void printColor() {
            int value = 10;
            if (value < 0) {
                System.out.println("Крассный");
            }
            if (value > 0 && value < 100) {
                System.out.println("Желтый");
            }
            if (value > 100) {
                System.out.println("Зеленый");
            }
        }
        //5 задание
        public static void compareNumbers() {
        int a = 6;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
        }

        }

