package vaccine.Class;

public class Personnel extends User {

   private String personnelName;

   public Personnel(String icno, String password, String personnelName) {
      super(icno, password);
      this.personnelName = personnelName;
   }

   public String getPersonnelName() {
      return personnelName;
   }

   public void setPersonnelName(String personnelName) {
      this.personnelName = personnelName;
   }

}
