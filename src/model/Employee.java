package model;

public class Employee {

    private String name;
    private int salary;
    private int uniqueIdentifier;
    private int age;

    public Employee(String name, int salary, int uniqueIdentifier, int age) {
        this.name = name;
        this.salary = salary;
        this.uniqueIdentifier = uniqueIdentifier;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(int uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void update(String name, int age, int salary) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public String toString(){
        return " name " + name + " salary " + salary + " age " + age;
    }


    public void displayInformation() {

        System.out.println(this.name + this.age + "," + this.salary + "," + this.uniqueIdentifier);

    }
}
