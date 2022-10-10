public class Employee {
    private final int id;
    private static int couter = 0;
    private int salary; // Размер зарплаты
    private int department; // Номер департамента
    private final String fullName; // ФИО сотрудника

    public Employee(int department, String fullName, int salary) {
        this.salary = salary;
        this.department = department;
        this.fullName = fullName;
        this.id = couter++;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID сотрудника - " + id + ", Департамент - " + department + ", ФИО - "
                + fullName +
                " Запралата - " + salary;
    }
}