package vaccine.Class;

public class People extends User {

   private String name;
   private int phone;
   private boolean citizen;

   public People(String name, int phone, boolean citizen, int icno, String password) {
      super(icno, password);
      this.name = name;
      this.phone = phone;
      this.citizen = citizen;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPhone() {
      return phone;
   }

   public void setPhone(int phone) {
      this.phone = phone;
   }

   public boolean isCitizen() {
      return citizen;
   }

   public void setCitizen(boolean citizen) {
      this.citizen = citizen;
   }

}
