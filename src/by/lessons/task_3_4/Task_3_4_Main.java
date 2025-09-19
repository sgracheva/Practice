package by.lessons.task_3_4;

import java.util.Scanner;

public class Task_3_4_Main {
    public static void main(String[] args) {
        //1. Дано уравнение: (10+12)*x=88;. Найти значение x
        System.out.println("*****Задача 1*******");

        int x;
        x = 88 / 22;
        System.out.println("x= " + x);

        //Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
        // Результат выведите в косноль
        System.out.println("*****Задача 4*******");

        Scanner in=new Scanner(System.in);
        System.out.println("Введите x");
        int x1= in.nextInt();
        System.out.println("Введите y");
        int y= in.nextInt();
        System.out.println("Введите z");
        int z= in.nextInt();

        x1+=y;
        y*=z;
        System.out.println(x1 +" " +y);

        System.out.println("*****Задача 5*******");
        //Дано уравнение 213/x+258/x+60=217. Вывести в консоль чему будет равен x

        double x3;
        int sum1 = 213 + 258;
        int sum2 = 217 - 60;
        x3 = sum1 / sum2;
        System.out.println("x= " + x3);

        System.out.println("*****Задача 5*******");
//        Даны значения: x=5; y=2; c=x*y;
//        6.2 Расставьте операции инкремента декремента так,
//         чтобы после выполнения операции (c=x*y) с=10; x=6; y=1

        int x4 = 5;
        int y4 = 2;
        int c = x4++ * y4--;
        System.out.println("c =" + c + " x4 =" + x4 + " y =" + y4);

         System.out.println("*****Задача 1.2*******");
//        //Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную.
//        // Иначе если a=b  вывести сумму этих чисел.
//        //Иначе, вывести разность b-a. Результат вычисления передать в новую переменную
//        Scanner in2= new Scanner(System.in);
//        System.out.println("Введите a");
//        int a= in2.nextInt();
//        System.out.println("Введите b");
//        int b= in2.nextInt();
//
//        if (a>b) {
//            c=a-b;
//            System.out.println(c);
//        }  else if (a==b);{
//            int d = a+b;
//            System.out.println(d);
//        }  else  {
//            int i= b-a;
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        int result; // переменная для результата

        if (a > b) {
            // Если a > b, result = a - b
            result = a - b;
        } else if (a == b) {
            // Если a == b, result = a + b
            result = a + b;
        } else {
            // Иначе, result = b - a
            result = b - a;
        }

        // Вывод результата
        System.out.println("Результат: " + result);

//        scanner.close();

        System.out.println("*****Задача 2.2*******");


//Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
//Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.

        Scanner in2 = new Scanner(System.in);
      System.out.println("Введите a");
       int a1= in2.nextInt();
      System.out.println("Введите b");
       int b1= in2.nextInt();

       if (a1>b1 & b1!=0){
           System.out.println(a1/b1);
    } else if (a1!=0) {
           System.out.println(b1/a1);
       } else {
           System.out.println(a1+b1);
       }

        System.out.println("*****Задача 3.2*******");
       //3.На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите a");
        int o= in1.nextInt();

        if (o%3==0){
            System.out.println("Число делится на 3");
        } else {
            System.out.println("Число НЕ делится на 3");

        }
    }
}