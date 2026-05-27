
/**Shahad Ahmad
 */
import java.util.*;
public class Department implements Information
{

    private String departmentName;
    private ArrayList<Nurse> nurses;
    private ArrayList<Doctor> doctors;
    private ArrayList<Surgery> surgeries;
    private int floor;

    public Department(String departmentName, int floor) {

        this.departmentName = departmentName;
        this.floor = floor;
        nurses = new ArrayList<>();
        doctors = new ArrayList<>();
        surgeries = new ArrayList<>();

    }
    
    //  Method to Schedule  a Surgery

    public void scheduleSurgery(String surgeryDescription, String date, Doctor doctor, Patient patient ) {
        if(doctors.contains(doctor)) {

            Surgery s = new Surgery(surgeryDescription, date, patient);
            surgeries.add(s);
            System.out.println("Surgery scheduled\n"  + s.toString() );

        } 
        else {

            System.out.println("Doctor not found in this department.");

        }

    }
    
    public void listAllSurgeries(){
       System.out.println(" All Surgeries in: " + departmentName + ": \n" );
       for (Surgery s : surgeries){
          System.out.println(s.toString());
       }
    
    }
    
   
    public void listSurgeriesByDate(String date) {
       System.out.println("Surgeries scheduled on: " + date + "\n");
       for(Surgery s : surgeries){
             if(s.getSurgeryDate().equals(date) ){
                 System.out.println("- " + s.toString() );
           }
       }
    }
    
     public String toString() {
       return "Department: " + departmentName +
              "\nFloor: " + floor +
              "\nDoctors: " + doctors +
              "\nNurses: " + nurses +
              "\nSurgeries: " + surgeries;
    }
}
    
    
    
    
