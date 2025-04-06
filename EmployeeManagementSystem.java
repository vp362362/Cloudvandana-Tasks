package Question3;
import java.util.ArrayList;
import java.util.List;

class Employee {

    int id;
    String name;
    double salary;

   
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("----------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee(1, "Raju", 50000);
        Employee emp2 = new Employee(2, "Shyam", 60000);
        Employee emp3 = new Employee(3, "Baburao", 55000);

        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

       
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
