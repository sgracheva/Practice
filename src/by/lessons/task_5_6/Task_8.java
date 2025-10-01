package by.lessons.task_5_6;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("*******Задача 8*********");
        // Создать массив из чисел. Вывести макс и мин число.
        int[] massive = {10, 2, 3, 4, 5};
        int min = massive[0];
        int max = massive[0];

        for (int d = 0; d < massive.length; d++) {
            if (massive[d] < min) {
                min = massive[d];

                if (massive[d] > max) {
                    max = massive[1];

                }
                System.out.println("Минимальное значение  " + min);
                System.out.println("Максимальное значение " + max);

            }
        }
    }
}
