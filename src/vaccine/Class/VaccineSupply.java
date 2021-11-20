package vaccine.Class;

public class VaccineSupply {

   private int vaccineID, inventory;
   private VaccineName vaccineName;
   private Centre centre;

   public VaccineSupply(int vaccineID, int inventory, VaccineName vaccineName, Centre centre) {
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

   public VaccineName getVaccineName() {
      return vaccineName;
   }

   public void setVaccineName(VaccineName vaccineName) {
      this.vaccineName = vaccineName;
   }

   public Centre getCentre() {
      return centre;
   }

   public void setCentre(Centre centre) {
      this.centre = centre;
   }

}
