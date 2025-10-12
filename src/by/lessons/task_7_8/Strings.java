package by.lessons.task_7_8;

public class Strings {

    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println(str);

        //Распечатать последний символ строки. Используем метод String.charAt()
        char endstr = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " +endstr);

        //Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith()
        boolean result = str.endsWith("Java!!!");
        System.out.println("заканчивается ли ваша строка подстрокой “java!”. " + result);

        //10. Вырезать строку Java c помощью метода String.substring()
        String sub=str.substring(0,6);
        System.out.println(sub);
        System.out.println("--------2------");

        String sub1=str.substring(7,11);
        System.out.println(sub1);
        System.out.println(str.indexOf("Java"));




    }

    }

