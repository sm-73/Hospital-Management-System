
//Sedra ALramadan
public class Employee extends Person implements Information
{
    private String jobTitle ;
    private double salary ;
    private String status ;
    
    public Employee(String name, String Id, String dateOfBirth, String gender, String jobTitle, double salary, String phoneNumber)
    {
        super(name, Id, dateOfBirth, gender, phoneNumber);
        this.jobTitle = jobTitle ;
        this.salary = salary ;
    }
    
    public void setSalary(double salary){
        if(salary > 0.0 ){
            this.salary = salary ;
        }
    }
    public void setStatus(String status){
        this.status = status ;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle ;
    }
    public void promote(String jobTitle, double salary){
        setJobTitle(jobTitle);
        setSalary(salary);
    }
    //getters
    public String getJobTitle(){
        return jobTitle ;
    }
    public double getSalary(){
        return salary ;
    }
    
    @Override
    public String getStatus(){
        return status;
    }
    @Override
    public String toString(){
        return super.toString() + "\nJob Title: " + jobTitle + "\nSalary: " + salary ;
    }
}
