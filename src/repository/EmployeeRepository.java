package repository;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
    private static Map<Integer,Employee> employeeData=new HashMap<>();
    //private static List<Employee> employeeData=new ArrayList<>();

    public static void save(Employee employee){
        employeeData.put(employee.getUniqueIdentifier(),employee);
    }

    public static Employee retrieve(final int key){
        return employeeData.get(key);
    }

    public List<Employee> fetchAll(){
        return new ArrayList<>(employeeData.values());
    }

    public static boolean delete(int employeeId){
        if(employeeData.containsKey(employeeId)) {

            employeeData.remove(employeeId);
            return true;
        }
        return false;
    }
}
