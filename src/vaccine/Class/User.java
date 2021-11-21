package vaccine.Class;

public abstract class User {

   private String icno, password;

   public User(String icno, String password) {
      this.icno = icno;
      this.password = password;
   }

   public String getIcno() {
      return icno;
   }

   public void setIcno(String icno) {
      this.icno = icno;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

}
