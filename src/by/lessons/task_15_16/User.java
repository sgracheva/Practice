package by.lessons.task_15_16;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login; //логин,
    private String password;// пароль,
    private String name;// имя,
    private String surname;// фамилия.

    public User(String login, String password, String name, String surname) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public static class UserRepository {
        public static List<User> users = new ArrayList<>() ;

        static {
            User user1 = new User("Sveta", "123456","Света", "Грачева");
            User user2 = new User("Svetala", "1234567","Светала", "Грач");
            User user3 = new User("Ivan", "1234","Иван", "Иванов");
            User user4 = new User("Petr", "112233","Петр", "Петров");
            User user5 = new User("Petra", "112244","Петра", "Петрова");


            users.add(user1);
            users.add(user2);
            users.add(user3);
            users.add(user4);
            users.add(user5);



        }
    }
}
