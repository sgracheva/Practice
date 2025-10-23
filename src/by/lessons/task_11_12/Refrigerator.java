package by.lessons.task_11_12;

public class Refrigerator implements Electrical,KitchenElectrical {
    //Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен).
    // Класс холодильник имплементирует интерфейс Электроприборы.
    // Переопределите метод work так, чтобы методы выводил «Холодильник морозит»

    private String name;
    private String brand;
    private int price;
    private Boolean isOn;


    @Override
    public void work() {
        System.out.println("Холодильник " +brand+ " морозит");

    }

    public Refrigerator(String name, String brand, int price, Boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }


    @Override
    public void broke() {
        System.out.println("Холодильник "+ brand + " ломается");
    }
}
