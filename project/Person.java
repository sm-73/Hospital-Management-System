// Manar Althafiri
public abstract class Person{
    private String Id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber ;
    public Person( String name, String Id,  String dateOfBirth, String gender, String phoneNumber){
       this.name=name;
       this.Id=Id;
       this.dateOfBirth = dateOfBirth;
       this.gender=gender;
       this.phoneNumber = phoneNumber ;
    }
  
    public String getName(){
        return name;
    }
    public String getId(){
        return Id;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getDateOfBirth(){
        return dateOfBirth ;
    }
    public String getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\nId: "+Id+"\nDate of Birth: "+ dateOfBirth +"\nGender: "+gender+ "\nPhone Number: " + phoneNumber + "\n";
    }
    public abstract String getStatus();
    //Patients: Their status could be "Admitted," "Discharged," "Waiting for Appointment," etc.
    //Employees: Their status could be "Active," "On Leave," "On Duty," etc.

    
}
