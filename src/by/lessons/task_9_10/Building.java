package by.lessons.task_9_10;

public class Building {
    //Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.
    private String street;
    private String wallMaterial;
    private int yearConstr;


    public Building(String street, String wallMaterial, int yearConstr) {
        this.street= street;
        this.wallMaterial=wallMaterial;
        this.yearConstr= yearConstr;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public int getYearConstr() {
        return yearConstr;
    }

    public void setYearConstr(int yearConstr) {
        this.yearConstr = yearConstr;
    }

    public String info (){
        String info =  " Улица = " + street + " Материал стен = " + wallMaterial + " Год постройки здания = " + yearConstr;
    return info;
    }
}
