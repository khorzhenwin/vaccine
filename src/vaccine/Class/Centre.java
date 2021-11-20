package vaccine.Class;

public class Centre {

   private int centreID, inventory;
   private String centreName, Address;

   public Centre(int centreID, String centreName, String Address, int inventory) {
      this.centreID = centreID;
      this.centreName = centreName;
      this.Address = Address;
      this.inventory = inventory;
   }

   public int getCentreID() {
      return centreID;
   }

   public void setCentreID(int centreID) {
      this.centreID = centreID;
   }

   public String getCentreName() {
      return centreName;
   }

   public void setCentreName(String centreName) {
      this.centreName = centreName;
   }

   public String getAddress() {
      return Address;
   }

   public void setAddress(String Address) {
      this.Address = Address;
   }

   public int getInventory() {
      return inventory;
   }

   public void setInventory(int inventory) {
      this.inventory = inventory;
   }

}
