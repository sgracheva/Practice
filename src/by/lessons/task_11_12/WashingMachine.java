package by.lessons.task_11_12;

public class WashingMachine implements Electrical, KitchenElectrical{

    //Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn.
    // Класс стиральная машина имплементирует интерфейс Электроприборы.
    // Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».

    private String name;
    private String brand;
    private int price;
    private Boolean isOn;


    @Override
    public void work() {
        System.out.println("Стиральная машина " +brand+ " стирает");
    }

    public WashingMachine(String name, String brand, int price, Boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void broke() {
        System.out.println("Стиральная машина "+ brand+ " ломается");
    }
}
