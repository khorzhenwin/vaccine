package vaccine.Class;

public class Centre {

   private int centreId, inventory;
   private String centreName, address, status;

   public Centre(int centreId, String centreName, String address, int inventory, String status) {
      this.centreId = centreId;
      this.inventory = inventory;
      this.centreName = centreName;
      this.address = address;
      this.status = status;
   }

   public int getCentreId() {
      return centreId;
   }

   public void setCentreId(int centreId) {
      this.centreId = centreId;
   }

   public int getInventory() {
      return inventory;
   }

   public void setInventory(int inventory) {
      this.inventory = inventory;
   }

   public String getCentreName() {
      return centreName;
   }

   public void setCentreName(String centreName) {
      this.centreName = centreName;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

}
