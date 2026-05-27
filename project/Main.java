//Manar AlThafiri
public class Main
{
     public static void main(String[] args)  {

        // Create a Patient
        Patient patient1 = new Patient("P001", "Alice Smith", "15-03-1990", "Female", "Waiting for Appointment", "123-456-7890");
        patient1.setMedicalHistory("No significant medical history.");
        patient1.setDiagnosis("Common cold");
        patient1.setTreatment("Rest and fluids");

        System.out.println("--- Patient Information ---");
        System.out.println(patient1);

        // Create a Doctor
        Doctor doctor1 = new Doctor("D001", "Dr. John Doe", "20-07-1975", "Male", 120000.00, "Cardiologist", "098-765-4321");
        doctor1.setStatus("On Duty");

        System.out.println("\n--- Doctor Information ---");
        System.out.println(doctor1);

        // Create an Appointment
        Appointment appt1 = new Appointment("25-05-2025", "10:00", doctor1, patient1);
        patient1.addAppointment(appt1); 
        doctor1.addAppointment(appt1); 
        
        System.out.println("\n--- Appointment Information ---");
        System.out.println(appt1);

        
        System.out.println("\n--- Requesting another appointment ---");
        doctor1.requestAppointment("25-05-2025", "10:00", patient1); 
        doctor1.requestAppointment("25-05-2025", "11:00", patient1); 

        System.out.println("\n--- All Appointments for Dr. John Doe ---");
        doctor1.listAllAppointment();

        // Create a Nurse
        Nurse nurse1 = new Nurse("N001", "Jane Doe", "01-01-1985", "Female", "Registered Nurse", 60000.00, "555-123-4567");
        nurse1.setNurseID("NRSID001");
        System.out.println("\n--- Nurse Information ---");
        System.out.println(nurse1);

        // Create Administrative Staff
        AdministrativeStaff admin1 = new AdministrativeStaff("A001", "Bob Johnson", "10-12-1980", "Male", 50000.00, "Receptionist", "555-987-6543");
        admin1.setAdminID("ADMINID001");
        System.out.println("\n--- Administrative Staff Information ---");
        System.out.println(admin1);

        // Create a Department
        Department cardiology = new Department("Cardiology", 3);
        
        System.out.println("\n--- Department Information ---");
        System.out.println(cardiology);

        // Schedule a surgery 
        System.out.println("\n--- Scheduling a Surgery ---");
        cardiology.scheduleSurgery("Heart Bypass", "30-05-2025", doctor1, patient1);

        System.out.println("\n--- Listing all Surgeries in Cardiology Department ---");
        cardiology.listAllSurgeries();

        System.out.println("\n--- Listing Surgeries by Date (30-05-2025) ---");
        cardiology.listSurgeriesByDate("30-05-2025");
}
}
