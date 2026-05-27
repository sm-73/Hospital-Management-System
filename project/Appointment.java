//Aisha ALrashed
public class Appointment implements Information{
    
    private String date;
    private String time;
    private Patient patient;
    private Doctor doctor;
    private static int nextAppointmentNumber = 1;
    private int appointmentNumber;
    
    public Appointment(String date, String time, Doctor doctor, Patient patient) {
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentNumber = nextAppointmentNumber++;
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Appointment Number: " + appointmentNumber + "\nDate: " + date + "\nTime: " + time + 
        "\nPatient: " + patient.getName() + "\nDoctor: " + doctor.getName();
    }
}