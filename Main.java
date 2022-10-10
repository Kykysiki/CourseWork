public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee(3, "Иванов И.Г.", 85000);
        EMPLOYEES[1] = new Employee(2, "Зыбнин И.А.", 53000);
        EMPLOYEES[2] = new Employee(3, "Свистунова И.Ф.", 79004);
        EMPLOYEES[3] = new Employee(4, "Тарасов А.Н.", 129340);
        EMPLOYEES[4] = new Employee(5, "Глыбина А.Г.", 36000);
        EMPLOYEES[5] = new Employee(1, "Шевчук К.Р.", 56066);
        EMPLOYEES[6] = new Employee(1, "Сыпнин А.Ф.", 77876);
        EMPLOYEES[7] = new Employee(2, "Чешски Р.Р.", 135000);
        EMPLOYEES[8] = new Employee(5, "Булгаков В.О.", 49000);
        EMPLOYEES[9] = new Employee(1, "Тутина А.А.", 90100);
        System.out.println();
        System.out.println("Список всех сотрудник:");
        printAllEmployees();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц - " + calculateSumSalary());
        System.out.println();
        if (getEmployeeMinSalary() == null) {
            System.out.println("Нет сотрудника с минимальной зарплатой");
        } else {
            System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeMinSalary());
        }
        if (getEmployeeMaxSalary() == null) {
            System.out.println("Нет сотрудника с максимальной зарплатой");
        } else {
            System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeMaxSalary());
        }
        System.out.println();
        System.out.println("Cреднее значение зарплат - " + calculateMeanSalary());
        System.out.println();
        System.out.println("Список ФИО всех сотрудников:");
        printAllFullName();
    }

    // Список всех сотрудников
    private static void printAllEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    //  Сумма затрат на зарплаты в месяц
    private static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    // Максимальная запрлата
    private static Employee getEmployeeMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    // Максимальная запрлата
    private static Employee getEmployeeMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    // Cреднее значение зарплат
    private static double calculateMeanSalary() {
       double mean = 0;
        int counting = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                counting++; // Подсчитываем количество сотрудников
                mean += employee.getSalary();
            }
        }
        double meanSalary = mean / counting;
        return meanSalary;
    }

    // Список ФИО всех сотрудников
    private static void printAllFullName() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }
}
