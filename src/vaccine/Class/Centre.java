package vaccine.Class;

import java.util.ArrayList;

public class Centre {

   private int centreID;
   private String centreName, Address;
   private ArrayList<VaccineSupply> myInventory = new ArrayList<VaccineSupply>();

   public Centre(int centreID, String centreName, String Address) {
      this.centreID = centreID;
      this.centreName = centreName;
      this.Address = Address;
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

   public ArrayList<VaccineSupply> getMyInventory() {
      return myInventory;
   }

   public void setMyInventory(ArrayList<VaccineSupply> myInventory) {
      this.myInventory = myInventory;
   }

}
