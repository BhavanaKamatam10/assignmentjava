package model;

public class Project {
    private String name;
    private int id;
    private String startDate;
    private String endDate;

    public Project(String name, int id, String startDate, String endDate) {
        this.name = name;
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String toString(){
        return " name " + name + " id " + id + " startDate " + startDate + "endDate" + endDate;
    }


    public void displayInformation() {

        System.out.println(this.name + this.id + "," + this.startDate + "," + this.endDate);

    }
}
