public class Person {
    //composition has-a ilişkisidir.
    private Job job;
    private car car1;
    public Person(Job job,car car1){
    
        this.job=job;
        this.car1=car1;
    
    }
    public String getJobRole() {  //It Calls getRole method from Job class.
        return job.getRole();
    }
     
    public void setJobRole(String newrole) {  //It Calls setRole method from Job class.
        job.setRole(newrole);
    }
    
    public int getJobSalary() { //It Calls getSalary method from Job class.
        return job.getSalary();
    }
    public void setJobSalary(int newsalary) { //It Calls setSalary method from Job class.
         job.setSalary(newsalary);
    }
 
    public int getJobId() { //It Calls getId method from Job class.
        return job.getId();
    }
    public void setJobId(int newid) { //It Calls setId method from Job class.
       job.setId(newid);
    }
  
    public int getcarModel() {   //It Calls getModel method from car class.
        return car1.getModel();    
    }

     
    public void setcarModel(int newmodel) {   //It Calls setModel method from car class.
         car1.setModel(newmodel);    
    }

    public int getcarPrice() {  //It Calls getPrice method from car class.
        return car1.getPrice();
    }
    public void setcarPrice(int newprice) {  //It Calls setPrice method from car class.
         car1.setPrice(newprice);
    }
 
}