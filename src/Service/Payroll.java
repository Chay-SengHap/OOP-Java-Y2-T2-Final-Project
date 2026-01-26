import java.util.ArrayList;
public class Payroll{

    private ArrayList<Employee> employee = new ArrayList<>(); 

    public Payroll{
        employee = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employee.add(emp);
    }

    public void displayEmployeePayroll(){
        System.out.println('==Display All Employees Detail==');
        for(Employee emp in : employee){
            emp.displayInfo();
        }
        System.out.println('================================');
    }
    


}