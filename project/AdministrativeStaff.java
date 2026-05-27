
/**
 * Sedra ALramadan
 */
public class AdministrativeStaff extends Employee implements Information
{
    private String adminID ;
    public AdministrativeStaff(String name, String Id, String dateOfBirth , String gender, double salary, String jobTitle, String phoneNumber){
        super(name, Id,dateOfBirth,gender,jobTitle, salary, phoneNumber);
    }
    
    public void setAdminID(String adminID){
        this.adminID = adminID ;
    }
    public String getAdminID(){
        return adminID ;
    }
    @Override
    public String toString(){
        return "Administrator ID: " + adminID + "\n" + super.toString() ;
    }
}
