public class Job {
    private String role;
    private int salary;
    private int id;
 
Job(String role,int salary,int id)
{
    this.role=role;
    this.salary=salary;
    this.id=id;
}


    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
 
}