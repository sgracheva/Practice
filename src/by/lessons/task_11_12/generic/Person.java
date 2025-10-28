package by.lessons.task_11_12.generic;

public class Person {
    //1.Создать класс Персонаж. Поля Имя, фамилия.


    //4. Создать класс Отдел. Имя id отдела. Отдела.

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
