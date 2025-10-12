package by.lessons.task_7_8;

public class MainClasses {
    Book book99 = new Book(1, "Октябрь", "Иванов", "Миснк", 2005, 380, 130);


    public static Book[] books() {
        /*
         int idParam, String nameParam, String authorParam, String publishParam, int establ, int pages, double price
         */

        Book book1 = new Book(1, "Октябрь", "Иванов", "Минск", 2005, 380, 130);
        Book book2 = new Book(2, "Тестовое", "Петрова", "Минск-2", 2000, 3550, 50);
        Book book3 = new Book(3, "Java для чайников", "Тестовый", "Минск-3", 2010, 350, 16);
        Book book4 = new Book(4, "Осень", "Грачева", "Минск-4", 20199, 350, 27);
        Book book5 = new Book(5, "Скоро Новый Год", "Санта", "Минск-5", 1957, 350, 88);
        Book arrayBooks[] = {book1, book2, book3, book4, book5};
        return arrayBooks;

    }
}