package by.lessons.task_11_12.generic;

public class Employee extends Person{
    //3. Создать класс Сотрудник. Поля, зарплата

    private int salary;

    public Employee(String name, String surname, int salary) {
        super(name, surname);
        this.salary= salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

