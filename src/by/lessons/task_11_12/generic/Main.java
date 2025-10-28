package by.lessons.task_11_12.generic;

public class Main {
    //7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
    //8. Вывести поочередно  имена персонажей, которые сидят за столом.

    public static void main(String[] args) {
        Student student= new Student("Svetlana", "Gracheva","Finance");
        Employee employee= new Employee("Ivan", "Ivanov", 2100);

        Table<Integer,Person>  table1= new Table<>(1, student);
        Table<Integer,Person> table2= new Table<>(2, employee);

        table1.personTable();
        table2.personTable();

    }
}
