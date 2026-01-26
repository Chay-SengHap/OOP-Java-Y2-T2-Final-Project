package Service;
import model.Employee;
import java.util.ArrayList;
public class Payroll{

    private ArrayList<Employee> employee;

    public Payroll(){
        employee = new ArrayList<>();
    }   

    public void addEmployee(Employee emp){
        employee.add(emp);
    }

    public void displayEmployeePayroll(){
        System.out.println("==Display All Employees Detail==");
        for(Employee emp : employee){
            emp.displayInfo();
        }
        System.out.println("================================");
    }
    


}