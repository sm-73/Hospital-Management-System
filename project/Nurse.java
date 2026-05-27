
/**Sedra ALramadan
 */
public class Nurse extends Employee implements Information
{
    private String nurseID ;
    public Nurse(String name, String Id, String dateOfBirth , String gender, String jobTitle, double salary , String phoneNumber){
        super(name, Id,dateOfBirth,gender,jobTitle, salary, phoneNumber);
    }
    
    public void setNurseID(String nurseID){
        this.nurseID = nurseID ;
    }
    public String getNurseID(){
        return nurseID ;
    }
    @Override
    public String toString(){
        return "Nurse ID: " + nurseID + "\n" + super.toString() ;
    }
}
