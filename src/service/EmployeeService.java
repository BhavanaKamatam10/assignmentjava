package service;

import model.Employee;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    public int createEmployee(String name,int salary,int age){
        final int uniqueIdentifier=EmployeeObject.EmployeeId();
        Employee employee=new Employee(name,salary,uniqueIdentifier,age);
        EmployeeRepository.save(employee);
        employee.displayInformation();
        return uniqueIdentifier;
    }
    public List<Employee> listEmployees(){
        List<Employee> employee = employeeRepository.fetchAll();
        return employee;
    }
    public static void updateEmployee(int employeeId, String name, int salary, int age){
        final int uniqueIdentifier=EmployeeObject.EmployeeId();
        Employee employee=EmployeeRepository.retrieve(employeeId);
        employee.update(name, age, salary);
        EmployeeRepository.save(employee);
        employee.displayInformation();
    }

    public static void deleteEmployee(int employeeId){
        EmployeeRepository.delete(employeeId);
    }

}
