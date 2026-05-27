
// Noorhan Ismail
import java.util.ArrayList;

public class Patient extends Person implements Information{
    //new fields
    private String medicalHistory;
    private String diagnosis;
    private String treatment;
    private ArrayList<Appointment> appointments;
    private String status;
    
    //constructor
    public Patient(String name, String Id, String dateOfBirth, String gender, String status, String phoneNumber){
        super(name, Id, dateOfBirth, gender,phoneNumber);
        this.status = status;
        this.appointments = new ArrayList<>(); 
    }
    public void setDiagnosis (String diagnosis){
        this.diagnosis = diagnosis ;
    }
    public void setTreatment (String treatment){
        this.treatment = treatment ;
    }
    public void setMedicalHistory(String medicalHistory){
        this.medicalHistory = medicalHistory;
    }
    //getters
    
    public String getMedicalHistory(){
        return medicalHistory;
    }
    
    public String getDiagnosis(){
        return diagnosis;
    }
    
    public String getTreatment(){
        return treatment;
    }
    
    public ArrayList<Appointment> getAppointments(){
        return appointments;
    }
    
    //end of getters
    
    public boolean isNew() {
        return appointments.isEmpty();
    }

    public void addAppointment(Appointment appointment){
        appointments.add(appointment);
    }
    
    public void displayAppointments(){
        for (Appointment a: appointments){
            System.out.println("Appointment date: " + a.getDate());
        }
    }
    
    //"Admitted" "Discharged" "Waiting for Appointment"
    @Override
    public String getStatus(){
        return status;
    }
    
    @Override
    public String toString() {
        String status;
        if(isNew()){
            status = "New";
        }
        else{
            status = "Existing (" + appointments.size() + " Appointments)";
        }
        return super.toString() + "\nMedical History: " + medicalHistory + 
        "\nDiagnosis: " + diagnosis + "\nTreatment: " + treatment +
        "\nNew OR Existing:  " + status + "\n";
    }
}
