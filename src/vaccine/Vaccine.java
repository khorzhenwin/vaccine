package vaccine;

import vaccine.Class.*;

public class Vaccine {

   public static People login;
   public static Personnel adminLogin;
   public static Centre editCentre;
   public static VaccineSupply inventory;

   public static void main(String[] args) {
      DataIO.read();
      Login firstpage = new Login();
      firstpage.setVisible(true);
   }

}
