package by.lessons.task_9_10;

public class AdminBuilding extends Building{

    //1.4 Создать класс Административном здании. Административное здание должно наследоваться от Гражданского здания.
    // Поля, которые можно определить в Административном здании: назначение административного здания (офисное, кинотеатр, спортсооружение),число людей, на которое рассчитано здание.

    private String adminBuildingPurpose;
    private int people;


    public AdminBuilding(String adminBuildingPurpose,int people, String street, String wallMaterial, int yearConstr) {
        super(street, wallMaterial, yearConstr);
        this.adminBuildingPurpose= adminBuildingPurpose;
        this.people= people;
    }
}
