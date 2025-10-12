package by.lessons.task_5_6;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("*******Задача 2*********");
        //2. Необходимо вывести следующую последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512 (цикл while)
        int x = 1;
        System.out.println(x);


        while (x < 512) {
            x = x * 2;
            System.out.println(x);
        }
    }
}
