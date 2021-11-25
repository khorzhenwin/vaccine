package vaccine.Class;

public class People extends User {

   private String name, phone;
   private boolean citizen;

   public People(String icno, String password, String name, String phone, boolean citizen) {
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

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public boolean isCitizen() {
      return citizen;
   }

   public void setCitizen(boolean citizen) {
      this.citizen = citizen;
   }

}
