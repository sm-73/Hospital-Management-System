
/**Shahad Ahmad
 */
public class Surgery implements Information
{
    
   private String surgeryDescription ;
   private String date;
   private Patient patient ;
   
   public Surgery(String surgeryDescription , String date , Patient patient  ){
      this.surgeryDescription = surgeryDescription;
      this.date=date;
      this.patient=patient;
   }

   public String getSurgeryDescription(){
      return surgeryDescription;
   }
   public String getSurgeryDate(){
       return date ;
   }
   public String toString(){
       return "Surgery Description: " + surgeryDescription + "\nScheduled on: " + date + "\nFor Patient: " + patient.toString() + "\n";
    }
}





