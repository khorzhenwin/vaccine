package vaccine.Class;

import java.util.ArrayList;

public class Centre {

   private int centreId;
   private String centreName, address, status;
   private ArrayList<VaccineSupply> myInventory = new ArrayList<VaccineSupply>();

   public Centre(int centreId, String centreName, String address, String status) {
      this.centreId = centreId;
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

   public ArrayList<VaccineSupply> getMyInventory() {
      return myInventory;
   }

   public void setMyInventory(ArrayList<VaccineSupply> myInventory) {
      this.myInventory = myInventory;
   }
}
