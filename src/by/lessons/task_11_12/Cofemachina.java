package by.lessons.task_11_12;

public class Cofemachina implements Electrical {
    //Создать класс Кофемашина. Поля наименование.
    // Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы.
    // Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».

    private String name;
    private String function;
    private int price;
    private Boolean isOn;

    public Cofemachina(String name, String function, int price, Boolean isOn) {
        this.name = name;
        this.function = function;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Кофемашина " + name + " варит");

    }

    public void makeCapuchino() {
        System.out.println("Кофемашина " + name + " делает капучино");

    }

    public void start() {
        isOn = true;
        System.out.println("Кофемашина стартует");
    }
}



