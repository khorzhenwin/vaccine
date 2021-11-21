package vaccine;

import vaccine.Class.*;

public class Vaccine {

   public People login;

   public static void main(String[] args) {
      DataIO.read();
      Login firstpage = new Login();
      firstpage.setVisible(true);
   }

}
