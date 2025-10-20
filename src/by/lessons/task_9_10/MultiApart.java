package by.lessons.task_9_10;

public class MultiApart extends CivilBuilding{
    //Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом.
    // Поля, которые можно определить в Многоквартирном жилье: количество квартир.

    private int numberOfApartments;


    public MultiApart(int numberOfApartments, String appointment, int numberoffloors, String street, String wallMaterial, int yearConstr) {
        super(appointment, numberoffloors, street, wallMaterial, yearConstr);
        this.numberOfApartments= numberOfApartments;
    }
}
