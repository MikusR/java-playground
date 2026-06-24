package info.mikusr.Objects.Peeple;

public class Employee extends Person {

    private String employeeId;
    private String title;

    Employee(String name, int age, String sex) {
        super(name, age, sex);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
