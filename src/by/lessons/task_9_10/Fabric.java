package by.lessons.task_9_10;

public class Fabric extends  IndustrialBuilding {
    //Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика.
    // Поля, которые можно определить в Фабрике:
    // количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)

    private int workers;
    private String products;

    public  Fabric (String street, String wallMaterial, int yearConstr, String industry,int workers,String products){
        super(street,wallMaterial,yearConstr,industry);
        this.workers = workers;
        this.products= products;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String info (){
        String info = "количество работников "+workers+ " выпускаемая продукция "+ products +super.info();
        return info;
    }
}
