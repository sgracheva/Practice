package by.lessons.task_11_12.generic;

public class Table <A extends Integer, B extends  Person> {
//Создать класс стол. Этот класс будет состоять из двух дженериков.
// Первый дженерик будет отображать инвертарный номер стола(Integer),
// второй дженерик будет отображать персонажа, который за ним будет сидеть
//6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.

    private A number;
    private B personTable;

    public void personTable(){
        System.out.println("За столом "+ number+ " сидит " +personTable.getName());
    }

    public Table(A number, B personTable) {
        this.number = number;
        this.personTable = personTable;
    }


}
