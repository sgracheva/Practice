package by.lessons.task_5_6;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("*******Задача 3*********");
        //Написать программу, которая посчитает сумму первых 10 чисел (цикл while)

        int a = 1;
        int b = 10;
        int result = 0;

        while (a <= b) {
            result = result + a;
            a++;
        }
        System.out.println(result);
    }
}
