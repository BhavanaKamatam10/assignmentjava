package controller;

import model.Employee;
import service.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeController<list> {
    private static EmployeeService employees;
    private static Scanner sc = new Scanner(System.in);
    private EmployeeService employeeService = new EmployeeService();

 public static void deleteEmployee(int employeeId){
     EmployeeService.deleteEmployee(employeeId);
 }
      public List<Employee> listEmployees(){
          return employeeService.listEmployees();
      }




  public static void updateEmployee(int employeeId, String name, int salary, int age){
          if(employeeId<0){
              System.out.println("Invalid ID");
          }
          EmployeeService.updateEmployee(employeeId, name, salary, age);
  }


    public void createEmployee(String name, int salary , int age) {
        System.out.println("Provide Employee details!");

        employeeService.createEmployee(name,salary,age);

    }

}
