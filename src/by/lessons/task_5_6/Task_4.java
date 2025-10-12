package by.lessons.task_5_6;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("*******Задача 4*********");
        //Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой (while)

        int i = 100;
        while (i >= 1) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", ");
            }
            i--;
        }
    }
}

