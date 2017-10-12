package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // HWLecture3Example1();
        // HWLecture3Example2();
        // HWLecture3Example3();
        // whileExample1();
        // whileExample2();
        // forExample3();
        // doExample4();
    }

    private static void HWLecture3Example1() {
        // write your code here
        // По введеному названию месяца. Определить время года
        Scanner scanner = new Scanner(System.in);
        int numMonth = 0;

        System.out.print("Введите номер месяца: ");
        numMonth = scanner.nextInt(); // 1,2,3

        if (numMonth == 12 || numMonth == 1 || numMonth == 2) {
            System.out.println("Сейчас зима");
            if (numMonth == 12) {
                System.out.println("Декабрь");
            } else if (numMonth == 1) {
                System.out.println("Январь");
            } else {
                System.out.println("Февраль");
            }
        } else if (numMonth == 3 || numMonth == 4 || numMonth == 5) {
            System.out.println("Сейчас весна");
            if (numMonth == 3) {
                System.out.println("Март");
            } else if (numMonth == 4) {
                System.out.println("Апрель");
            } else {
                System.out.println("Май");
            }
        } else if (numMonth == 6 || numMonth == 7 || numMonth == 8) {
            System.out.println("Сейчас лето");
            if (numMonth == 6) {
                System.out.println("Июнь");
            } else if (numMonth == 7) {
                System.out.println("Июль");
            } else {
                System.out.println("Август");
            }
        } else if (numMonth == 9 || numMonth == 10 || numMonth == 11) {
            System.out.println("Сейчас осень");
            if (numMonth == 9) {
                System.out.println("Сентябрь");
            } else if (numMonth == 10) {
                System.out.println("Октябрь");
            } else {
                System.out.println("Ноябрь");
            }
        } else {
            System.out.println("Введен некорректный месяц. Ураааа :)");
        }
    }

    private static void HWLecture3Example2() {
        // Дано трехзначное число.
        // Разбить его на ед., дес., сотни.
        // Сравнить :
        // eд > дес
        // eд > сотни
        // дес > сотни

        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число в диапазоне [100, 999]: ");
        num = scanner.nextInt();           // 768

        if (num >= 100 && num <= 999) {
            int ed = 0; // единицы
            int des = 0; // десятки
            int sot = 0; // сотни

            sot = num / 100;                        // 768/100 = 7.68 = 7
            des = (num - (sot * 100)) / 10;         // (768 - (7*100))/10 = 68/10 = 6.8 = 6
            ed = (num - (sot * 100) - (des * 10));  // 768 - 700 - 60 = 8

            if (ed > des) {
                System.out.println("Единицы больше десятых");
            } else {
                System.out.println("Единицы меньше или равны десятым");
            }

            if (ed > sot) {
                System.out.println("Единицы больше сотых");
            } else {
                System.out.println("Единицы меньше или равны сотым");
            }

            if (des > sot) {
                System.out.println("Десятые больше сотых");
            } else {
                System.out.println("Десятые меньше или равны сотым");
            }
        } else {
            System.out.println("Число некорректное!!!");
        }
    }

    private static void HWLecture3Example3() {
        // Даны вещественные числа x,y.
        // Большее из них заменить удвоен. произвденеим.
        // Меньшее заменить половиной суммы

        double x = 0;
        double y = 0;
        double multiply = 0;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x : ");
        x = scanner.nextDouble();

        System.out.print("Enter y : ");
        y = scanner.nextDouble();

        if (x != y) {
            multiply = 2 * x * y;
            sum = (x + y) / 2;

            if (x > y) {
                System.out.println("x > y");
                x = multiply;
                y = sum;
            } else {
                System.out.println("x <= y");
                x = sum;
                y = multiply;
            }

            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        } else {
            System.out.println("x должен быть не равен y");
        }
    }

    private static void whileExample1() {
        // Таблица умножения на 9
        int num = 9;
        int counter = 1;
        int res = 0;

        System.out.println("Таблица умножения на 9 : ");
        while (counter <= 10) {
            res = num * counter;
            System.out.println(num + " * " + counter + " = " + res);
            ++counter;
        }

        System.out.println("После цикла");
    }

    private static void whileExample2() {
        // Таблица умножения на 3
        int num = 3;
        int counter = 1;
        int result = 0;

        // (counter <= 10) - условие цикла
        System.out.println("Таблица умножения на 3 : ");
        while (counter <= 10) {
            // Тело цикла
            result = num * counter;
            System.out.println(num + " * " + counter + " = " + result);

            // Увеличиваем на 1
            ++counter;
        }
        System.out.println("Цикл закончился");
    }

    private static void forExample3() {
        // Нарисовать на экране прямоугольник a*b
        // a и b вводятся с клавиатуры
        // Нарисовать символом, который введет пользователь

        int a = 0; // высота
        int b = 0;  // ширина
        String charForDraw;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = scanner.nextInt();

        System.out.print("Enter b : ");
        b = scanner.nextInt();

        System.out.print("Enter one char for draw : ");
        charForDraw = scanner.next();

        // Внещний цикл
        // Выполняется a раз
        for (int i = 0; i < a; i++) {
            // Вложенный цикл
            // Выполняется b*a раз
            for (int j = 0; j < b; j++) {
                // Рисуем в строчку символы
                System.out.print(charForDraw);
            }
            // Перенос на новую строку
            System.out.println();
        }
    }

    private static void doExample4(){
        // while() - цикл с предусловием. Сначала проверяем
        //         условие, если оно true, то выполняем тело цикла
        //         иначе, завершаем выполнение цикла
        // do-while() - цикл с постусловием. Сначала выполняем тело цикла
        //             , а потом проверяем условие. Если онщ true
        //             , то выполняем тело цикла. Иначе, завершаем выполнение цикла.
        // for(;;)   - аналог while(), но с инициализированным индексатором (счетчика)
        // foreach - магия из ООП :)

        int i = 20;

        do {
            System.out.println("i = " + i);
        }while(i < 20);
    }
}
