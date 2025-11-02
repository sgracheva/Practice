package by.lessons.task_13_14;

import java.util.Objects;

public class Book {
    // Создай класс Book с полями:
    //• String title
    //• String author

    private String title;
    private  String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean equals (Object o){
                    Book book = (Book) o;
            if (title.equals(book.getTitle()))
        {
                return true;
            }
            return false;
        }


    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
