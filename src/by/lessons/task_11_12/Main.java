package by.lessons.task_11_12;

public class Main {
    public static void main(String[] args) {

        Cofemachina cofemachina1 = new Cofemachina("Panasonic", "Варит кофе", 1700, false);
        Cofemachina cofemachina2 = new Cofemachina("Delongi", "Варит кофе", 3700, false);

        Refrigerator refrigerator1 = new Refrigerator("Холодильник1", "Атлант", 1500, false);
        Refrigerator refrigerator2 = new Refrigerator("Холодильник2", "LG", 2500, false);

        WashingMachine washingMachine1= new WashingMachine("Стиральная машина1", "LG", 1505, false);
        WashingMachine washingMachine2= new WashingMachine("Стиральная машина2", "Bosh", 2505, false);

        VacuumCleaner vacuumCleaner1= new VacuumCleaner("Пылесос1","LG", 8000, false);
        VacuumCleaner vacuumCleaner2= new VacuumCleaner("Пылесос2","Haeir", 5000, false);

        Electrical [] exhibition ={cofemachina1,cofemachina2,refrigerator1,refrigerator2,washingMachine1,washingMachine2};
        for (Electrical e: exhibition){
            e.work();
        }

        //Выставка из электроприбров
        Electrical[] devices = {cofemachina1, cofemachina2, refrigerator1, refrigerator2, washingMachine1, washingMachine2, vacuumCleaner1, vacuumCleaner2};

        //Продемонстрировать способности каждого электроприбора
        System.out.println("Выставка электронных девайсов");
        for (Electrical device : devices) {
            device.work();
        }

        System.out.println("**********************************************************************");

        //выставку только из Кухонной техники
        KitchenElectrical[] kitchenDevices = {refrigerator1, refrigerator2, washingMachine1, washingMachine2};

        //Продемонстрировать спосбоности всех электроприборов.
        System.out.println("Выставка кухонных девайсов");
        for (KitchenElectrical kitchenDevice : kitchenDevices) {
            kitchenDevice.broke();
        }

        System.out.println("************************************************************************");

        System.out.println("Выставка кофемашин");
        Cofemachina[] cofemachinas = {cofemachina1,cofemachina2};

        for (Cofemachina cofemachina : cofemachinas) {
            cofemachina.work();
        }


    }
    }

