package by.lessons.task_15_16;

import by.lessons.task_13_14.exception.NotCorrectPasswordException;
import by.lessons.task_13_14.exception.UserNotFoundException;
import by.lessons.task_13_14.service.UserService;

public class Main {
    //Задача 1
    //1. Заполнить HashMap 10 объектами <Integer, String>.
    // Найти строки у которых ключ>5. Если ключ = 0, вывести строки через запятую.
    // Перемножить все ключи, где длина строки>5.

    public static void main(String[] args) {
//        Map<Integer, String> entry = new HashMap<>();
//
//        entry.put(1, "string1");
//        entry.put(2, "string2");
//        entry.put(9, "string3");
//        entry.put(4, "string4");
//        entry.put(5, "string5");
//        entry.put(6, "string6");
//        entry.put(7, "string7");
//
//
//        Set<Integer> keys = entry.keySet();
//        Integer var =0;
//        for (Integer i : keys) {
//            if (i > 5) {
//                System.out.println(entry.get(i));
//            }
//            if (i == 0) {
//                System.out.println(entry.values());
//            }
//            String val = entry.get(i);
//            if (val.length()>5){
//                var= i+var;
//
//            }
//        }
//        System.out.println(var);
//
//    }
        authenticating();
    }

    /*Задача 2
1. Создать класс пользователь. Поля логин, пароль, имя, фамилия.
2. Создать класс UserRepository. Внутри класса создать статическую переменную List<User>
 users.
3. Выполнить инициаизацию коллекции в статическом блоке. Создать 5 пользователей и
заполнить поля.
4. Создать класс сервис. Реализовать в этом классе метод аутенфикации  пользователя
(void authenticate (String login, String password). Этот метод должен проверять наличие
пользователя в репозитории по логину. Если пользователя нет, то выбрасываем собственное
 исключение (UserNotFoundException)
5. В этом же методе выполнить проверку пароля пользователя, если по логину мы его нашли.
 Если пароль не совпадает, то выбрасываем собственное исключение
  NotCorrectPasswordException.
6. В классе main при вызове метода аутенфикации перехватите исключение
UserNotFoundException и выведите в консоль (нет пользователя)
7. Также перехватите оставшиеся исключения и в блоке catch выведите в консоль сообщение
(Вы не прошли аутенфикацию)*/
    public static void authenticating() {
        try {
            UserService userService = new UserService();
            userService.authenticate("Masha1", "ywdcd");
        } catch (NotCorrectPasswordException notCorrectPasswordException) {
            System.out.println("Вы не прошли аутенфикацию");
        } catch (UserNotFoundException userNotFoundException) {
            System.out.println(userNotFoundException.getMessage());
        }
    }
    }
