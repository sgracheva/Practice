package by.lessons.task_9_10;

public class Main {
    public static void main(String[] args) {
        Fabric fabric1 = new Fabric("Пушкина", "бетон", 7, "Строительная", 15, "Блоки");
        Fabric fabric2 = new Fabric("Чайкиной", "железо", 250,"Машиностроительная", 5000, "Трактор");

        Village villages = new Village();
        villages.addBuilding(fabric1);
        villages.addBuilding(fabric2);

        villages.info();


    }
}
