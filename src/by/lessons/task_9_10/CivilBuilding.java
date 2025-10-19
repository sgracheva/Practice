package by.lessons.task_9_10;

public class CivilBuilding extends Building {
    //Создать класс Гражданские здания (CivilBuilding).
    // Гражданские здания должны наследоваться от класса Постройка.
    // Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.

    private String appointment;// назначение
    private int numberoffloors;// кол-во этажей


    public CivilBuilding(String appointment,int numberoffloors, String street, String wallMaterial, int yearConstr) {
        super(street, wallMaterial, yearConstr);
        this.appointment=appointment;
        this.numberoffloors=numberoffloors;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public int getNumberoffloors() {
        return numberoffloors;
    }

    public void setNumberoffloors(int numberoffloors) {
        this.numberoffloors = numberoffloors;
    }
}
