package main;

import controller.EmployeeController;
import controller.ProjectController;
import model.Employee;
import model.projectMain;

import java.util.ArrayList;
import java.util.Scanner;


public class MainFlow extends projectMain {

    private static final Scanner scanner = new Scanner(System.in);
    public static final ArrayList<Employee> employees = new ArrayList<>();
    private static EmployeeController employeeController = new EmployeeController();
   private static ProjectController projectController = new ProjectController();

    public static void main(String[] args) {


        while (true) {
            int userChoice = askUsersChoice();
            employeeFlow(userChoice);
        }
    }

    private static void employeeFlow(int userChoice) {
        switch (userChoice)  {
            case 1:
                employeeController.createEmployee(takeName(),takeSalary(),takeAge());
                break;

                case 2:
                    System.out.println("Enter the updated information");
                            employeeController.updateEmployee(takeId(),takeName(),takeSalary(),takeAge());

                    break;

                case 3:
                    System.out.println("Enter employee Id to delete!");
                    employeeController.deleteEmployee(takeId());

                    break;

                case 4:
                    System.out.println(employeeController.listEmployees());
                    break;

        }
    }

    private static int askUsersChoice() {

        System.out.println("1. Create Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. List Employees");
        System.out.println("Choose your choice! ");

        return scanner.nextInt();
    }
    private static int takeAge() {
        System.out.println("Age: ");
        return scanner.nextInt();
    }

    private static int takeSalary() {
        System.out.println("Salary: ");
        return scanner.nextInt();
    }

    private static String takeName() {
        System.out.println(" Name: ");
        return scanner.next();

    }
    private static int takeId() {
        System.out.println(" Id: ");
        return scanner.nextInt();

    }


}
