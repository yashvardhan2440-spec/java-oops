class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class Faculty extends Employee {
    String department;

    Faculty(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class AdministrativeStaff extends Employee {
    String designation;

    AdministrativeStaff(String name, int employeeId, double salary, String designation) {
        super(name, employeeId, salary);
        this.designation = designation;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Designation: " + designation);
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Rahul", 101, 50000);

        Faculty f = new Faculty(
            "Amit",
            102,
            70000,
            "Computer Science"
        );

        AdministrativeStaff a = new AdministrativeStaff(
            "Priya",
            103,
            60000,
            "Office Manager"
        );

        System.out.println("----- Employee -----");
        e.displayDetails();
        System.out.println("Bonus: " + e.calculateBonus());

        System.out.println("\n----- Faculty -----");
        f.displayDetails();
        System.out.println("Bonus: " + f.calculateBonus());

        System.out.println("\n----- Administrative Staff -----");
        a.displayDetails();
        System.out.println("Bonus: " + a.calculateBonus());
    }
}