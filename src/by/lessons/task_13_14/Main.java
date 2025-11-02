package by.lessons.task_13_14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
    //1.2 Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
    //1.3 Вывести все записи.
    //1.4 Проверить, содержит ли коллекция слово Конфета
    //1.5 Посчитать количество элементов в коллекции


    public static void main(String[] args) {
        task1();
        task3();


        List<String> words = new ArrayList<>();
        String string1 = new String("Привет");
        String string2 = new String("Как дела");
        String string3 = "Праздник";
        String string4 = "Суфле";

        words.add(string1);
        words.add(string2);
        words.add(string3);
        words.add(string4);
        for (String word : words) {
            System.out.println(word);
        }
        boolean result = words.contains("Конфета");
        System.out.println(result);

        int result1 = words.size();
        System.out.println(result);


    }

    public static void task1() {
        List<String> words = new ArrayList<>();
        String string1 = new String("Привет");
        String string2 = new String("Как дела");
        String string3 = "Праздник";
        String string4 = "Суфле";

        words.add(string1);
        words.add(string2);
        words.add(string3);
        words.add(string4);
        for (String word : words) {
            System.out.println(word);
        }
        boolean result = words.contains("Конфета");
        System.out.println(result);

        int result1 = words.size();
        System.out.println(result);

    }

    //Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров.
    // Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.

//    public static void task2() {
//      //  List<String> purchases = List.of("Хлеб", "Молоко", "Яйца", "Творог", "Мясо");
//        List<String> purchases2=new ArrayList<>();
//
//        String.purchase1= "Хлеб";
//        String.purchase2= "Молоко";
//        String.purchase3= "Яйца";
//        String.purchase4= "Творог";
//        String.purchase5= "Мясо";
//
//        printList(purchases);
//
//        purchases.remove("Молоко");
//        printList(purchases);

//    private static void printList (List<String> purchases) {
//        //List <String> purchases = List.of("Хлеб", "Молоко", "Яйца", "Творог", "Мясо");
//        for (String purch : purchases){
//            System.out.println(purch);
//        }
//    }

    public static void task3 (){
        Book book1= new Book("Преступление", "Достоевский");
        Book book2= new Book("Золотая рыбка", "Пушкин");
        Book book3= new Book("Муму", "Тургенев");

        List <Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

       // books.remove(book2);

        for (Book book: books){
            System.out.println(book2);
        }

    }



}
