//Sedra Albasha

import java.util.*;
public class Doctor extends Employee implements Information{
    private ArrayList<Appointment> listOfAppointment = new ArrayList<>();
    private String status ;
    
    public Doctor(String name, String Id, String dateOfBirth , String gender, double salary, String jobTitle, String phoneNumber){
        super(name, Id,dateOfBirth,gender,jobTitle, salary, phoneNumber);
    }
    
    public void setStatus(String status){
        this.status = status ;
    }
    
    public void listAllAppointment(){
        for(Appointment a : listOfAppointment){
            System.out.println(a);
        }
    }
    
    public boolean isFree(String date,String time){
        for(Appointment a : listOfAppointment){
            if(a.getDate().equals(date) && a.getTime().equals(time)){
                return false;
            }
        }
        return true;
    }
    
    public void addAppointment(Appointment appointment){
        listOfAppointment.add(appointment);
    }
    
    public void requestAppointment(String date,String time, Patient patient){
        String[] workTime = {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00"};
        HashSet<String> times = new HashSet<>();
        
        for(Appointment a : listOfAppointment){
            if(a.getDate().equals(date)){
                times.add(a.getTime());
            }
        }
        
        if(isFree(date,time)){
            listOfAppointment.add(new Appointment(date, time, this, patient));
            System.out.println("Time is booked for " + patient.getName() + " At date: " + date + " Time: " + time);
        }
        else{
            System.out.println("Time is not available!");
            System.out.println("Available times");
            
            boolean check = false;
            for(String t : workTime){
                if(!times.contains(t)){
                    System.out.println("  " + t);
                    check = true;
                }
            }
            
            if(!check){
                System.out.println("No available times on date " + date);
            }
        }
    }
    @Override
    public String getStatus(){
        return status;
    }
    @Override
    public String toString(){
        return super.toString() + "\nStatus: " + status ;
    }
}
