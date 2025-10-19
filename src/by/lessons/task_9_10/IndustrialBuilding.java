package by.lessons.task_9_10;

public class IndustrialBuilding extends  Building{
    //Создать класс Промышленном здание (IndustrialBuilding).
    // Промышленные здания наследуются от Постройки.
    // Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано
    // (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)

    private  String industry; // отрасль

    public  IndustrialBuilding (String street, String wallMaterial, int yearConstr, String industry){
        super(street,wallMaterial,yearConstr);
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String info(){
        String info = "Отрасль в которой здание задействовано " +industry +super.info();
        return info;
    }
}
