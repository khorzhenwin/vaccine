package vaccine.Class;

public abstract class User {

   private int icno;
   private String password;

   public User(int icno, String password) {
      this.icno = icno;
      this.password = password;
   }

   public int getIcno() {
      return icno;
   }

   public void setIcno(int icno) {
      this.icno = icno;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

}
