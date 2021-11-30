package vaccine.Class;

public class VaccineSupply {

   private int vaccineID, inventory;
   private String vaccineName;
   private Centre centre;

   public VaccineSupply(int vaccineID, String vaccineName, int inventory, Centre centre) {
      this.vaccineID = vaccineID;
      this.inventory = inventory;
      this.vaccineName = vaccineName;
      this.centre = centre;
   }

   public int getVaccineID() {
      return vaccineID;
   }

   public void setVaccineID(int vaccineID) {
      this.vaccineID = vaccineID;
   }

   public int getInventory() {
      return inventory;
   }

   public void setInventory(int inventory) {
      this.inventory = inventory;
   }

   public String getVaccineName() {
      return vaccineName;
   }

   public void setVaccineName(String vaccineName) {
      this.vaccineName = vaccineName;
   }

   public Centre getCentre() {
      return centre;
   }

   public void setCentre(Centre centre) {
      this.centre = centre;
   }

   public void reserve2Dose() {
      inventory = inventory - 2;
   }

   public void reserve1Dose() {
      inventory = inventory - 1;
   }

   public void unreserve2Dose() {
      inventory = inventory + 2;
   }

   public void unreserve1Dose() {
      inventory = inventory + 1;
   }
}
