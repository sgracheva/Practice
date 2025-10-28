package by.lessons.task_11_12;

public class VacuumCleaner implements Electrical {

    //Cоздать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn.
    // Класс Пылесос имплементирует интерфейс Электроприборы.
    // Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает»

    private String name;
    private String brand;
    private int price;
    private Boolean isOn;


    @Override
    public void work() {
        System.out.println("Пылесос " + brand+ " убирает");
    }

    public VacuumCleaner(String name, String brand, int price, Boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }
}


