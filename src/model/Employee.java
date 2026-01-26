package payroll.model;

public class Employee {

    public String id;
    public String name;
    public String position;
    public double baseSalary;
    public int workingHours;
    public double hourlyRate;

    public Employee(String id, String name, String position,
                    double baseSalary, int workingHours, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
    }
}
