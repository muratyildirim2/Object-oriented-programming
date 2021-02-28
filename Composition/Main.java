public class Main {
    public static void main(String[] args) {
         Job job1= new Job("Engineer",2000,1122);
         car car1= new car(2017,200000);

        Person person = new Person(job1,car1);
        
        System.out.println("Department of person : "+person.getJobRole());
        System.out.println("Salary of person : "+person.getJobSalary());
        System.out.println("ID of person : "+person.getJobId());
        System.out.println("Car model of person : "+person.getcarModel());
        System.out.println("Car price of person : "+person.getcarPrice());

        person.setJobId(1111);
        person.setJobRole("Manager");
        person.setJobSalary(3000);
        person.setcarModel(2020);
        person.setcarPrice(250000);

         System.out.println("\n*******************************  Set Values  ***************************************\n");

        System.out.println("Department of person : "+person.getJobRole());
        System.out.println("Salary of person : "+person.getJobSalary());
        System.out.println("ID of person : "+person.getJobId());
        System.out.println("Car model of person : "+person.getcarModel());
        System.out.println("Car price of person : "+person.getcarPrice());


    }
}