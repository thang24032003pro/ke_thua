/**
 * PayrollSystemRefactored.java
 * Refactored payroll system using Inheritance and Polymorphism.
 */
public class PayrollSystemRefactored {
    public static void main(String[] args) {
        Employee[] empList = {
            new FullTimeEmployee("Alice", 20000000),
            new PartTimeEmployee("Bob", 45),
            new Intern("Charlie"),
            new Freelancer("Diana", 4)
        };

        System.out.println("--- BẢNG LƯƠNG THÁNG NÀY (Refactored) ---");
        for (Employee emp : empList) {
            System.out.println("Nhân viên: " + emp.getName() + " | Lương: " + emp.calculateSalary() + " VNĐ");
        }
    }
}

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method: subclasses must provide their own salary calculation
    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double baseSalary;

    public FullTimeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class PartTimeEmployee extends Employee {
    private int workingHours;
    private static final double HOURLY_RATE = 100_000; // 100k/giờ

    public PartTimeEmployee(String name, int workingHours) {
        super(name);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return workingHours * HOURLY_RATE;
    }
}

class Intern extends Employee {
    private static final double STIPEND = 3_000_000; // 3 triệu

    public Intern(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return STIPEND;
    }
}

class Freelancer extends Employee {
    private int numberOfProjects;
    private static final double RATE_PER_PROJECT = 1_500_000; // example rate

    public Freelancer(String name, int numberOfProjects) {
        super(name);
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return numberOfProjects * RATE_PER_PROJECT;
    }
}
