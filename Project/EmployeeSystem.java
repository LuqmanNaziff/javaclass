package Project;
import java.util.Scanner;
public class EmployeeSystem {
    
    public static void main(String[] args){
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < employees.length; i++){
            System.out.println("Enter Employee detail " + (i + 1));

            System.out.print("Name: ");
            String setName = scanner.nextLine();

            System.out.print("Base Salary: ");
            double baseSalary = scanner.nextDouble();

            employees[i] = new Employee(setName, baseSalary);
        }

        System.out.println("\nEmployee Details: ");
        for(Employee employee : employees){
            employee.displayDetails();
        }
        scanner.close();
        }

    }

