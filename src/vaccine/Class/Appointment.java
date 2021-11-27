package vaccine.Class;

public class Appointment {

   private People person;
   private String date1, date2, time1, time2;
   private boolean dose1, dose2;
   private Centre location;

   public Appointment(People person, String date1, String date2, String time1, String time2, boolean dose1, boolean dose2, Centre location) {
      this.person = person;
      this.date1 = date1;
      this.date2 = date2;
      this.time1 = time1;
      this.time2 = time2;
      this.dose1 = dose1;
      this.dose2 = dose2;
      this.location = location;
   }

   public People getPerson() {
      return person;
   }

   public void setPerson(People person) {
      this.person = person;
   }

   public String getDate1() {
      return date1;
   }

   public void setDate1(String date1) {
      this.date1 = date1;
   }

   public String getDate2() {
      return date2;
   }

   public void setDate2(String date2) {
      this.date2 = date2;
   }

   public String getTime1() {
      return time1;
   }

   public void setTime1(String time1) {
      this.time1 = time1;
   }

   public String getTime2() {
      return time2;
   }

   public void setTime2(String time2) {
      this.time2 = time2;
   }

   public boolean isDose1() {
      return dose1;
   }

   public void setDose1(boolean dose1) {
      this.dose1 = dose1;
   }

   public boolean isDose2() {
      return dose2;
   }

   public void setDose2(boolean dose2) {
      this.dose2 = dose2;
   }

   public Centre getLocation() {
      return location;
   }

   public void setLocation(Centre location) {
      this.location = location;
   }

}
