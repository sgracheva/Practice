package by.lessons.task_5_6;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int arr[] = {23, 43, 23, 42, 13, 4, 1, 4, 9};
        for (int
             i = arr.length - 1; i >= 0; i--) {
            for (int j =
                 0; j < i; j++) {
                if (arr[j] > arr
                        [j + 1]) {
                    int buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
