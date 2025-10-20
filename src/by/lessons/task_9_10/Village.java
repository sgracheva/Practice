package by.lessons.task_9_10;

public class Village {
    //Класс Деревня. Деревня будет состоять из построек.
    // К постройкам относятся промышленные здания и гражданские.
    // К промышленным зданиям будут относится заводы и фермы.
    // К гражданским будут относится: административные здания, жилые здания.
    private  Building [] buildings = new Building[1];


        public void addBuilding(Building building) {

            int count = 0;
            for (int i = 0; i < buildings.length; i++) {
                count++;
            }

            Building[] newBuildings = new Building[count + 1];
            for (int i = 0; i < count; i++) {
                newBuildings[i] = buildings[i];
            }
            newBuildings[count] = building;
            buildings = newBuildings;



        }
        public void info(){
            for (Building building: buildings){
                System.out.println(building);
            }

        }

    }

