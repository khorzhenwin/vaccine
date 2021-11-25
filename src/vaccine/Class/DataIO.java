package vaccine.Class;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataIO {

   public static ArrayList<Centre> allCentres = new ArrayList<Centre>(); //centre.txt - contains vaccine inventory
   public static ArrayList<People> allPeople = new ArrayList<People>(); //people.txt
   public static ArrayList<Personnel> allPersonnel = new ArrayList<Personnel>(); //personnel.txt
   public static ArrayList<Appointment> allAppointments = new ArrayList<Appointment>(); //appointment.txt

   //Initialize all reading into java array lists
   public static void read() {
      try {
         Scanner s = new Scanner(new File("people.txt"));
         Scanner s1 = new Scanner(new File("centre.txt"));
         Scanner s2 = new Scanner(new File("personnel.txt"));
         Scanner s3 = new Scanner(new File("appointment.txt"));
         // -----------------------People-----------------------
         while (s.hasNext()) {
            //icno
            String icno = s.nextLine();
            //password
            String password = s.nextLine();
            //name
            String name = s.nextLine();
            //phone
            String phone = s.nextLine();
            //citizen
            boolean citizen = Boolean.parseBoolean(s.nextLine());
            s.nextLine();
            People user = new People(icno, password, name, phone, citizen);
            // Add the data to the array list object in java to read, write, compare easier
            allPeople.add(user);
         }
         // ------------------------Centre-------------------------
         while (s1.hasNext()) {
            // centreId
            int centreId = Integer.parseInt(s1.nextLine());
            // centreName
            String centreName = s1.nextLine();
            // centreAddress
            String centreAddress = s1.nextLine();
            // inventory for vaccine
            int inventory = Integer.parseInt(s1.nextLine());
            // centre status
            String status = s1.nextLine();
            s1.nextLine();
            Centre place = new Centre(centreId, centreName, centreAddress, inventory, status);
            allCentres.add(place);
         }
         // -----------------------Personnel-----------------------
         while (s2.hasNext()) {
            //icno
            String personnel_icno = s2.nextLine();
            //password
            String personnel_password = s2.nextLine();
            //name
            String personnel_name = s2.nextLine();
            s2.nextLine();
            Personnel committee = new Personnel(personnel_icno, personnel_password, personnel_name);
            allPersonnel.add(committee);
         }
         // -----------------------Appointment-----------------------
         while (s3.hasNext()) {
            //////////////////////////People object///////////////////////
            //icno
            String icno = s3.nextLine();
            //password
            String password = s3.nextLine();
            //name
            String name = s3.nextLine();
            //phone
            String phone = s3.nextLine();
            //citizen
            boolean citizen = Boolean.parseBoolean(s3.nextLine());
            People user1 = new People(icno, password, name, phone, citizen);
            ///////////////////////////////////////////////////////////////
            // date 1
            String date1 = s3.nextLine();
            // date 2
            String date2 = s3.nextLine();
            // dose 1
            boolean dose1 = Boolean.parseBoolean(s3.nextLine());
            // dose 2
            boolean dose2 = Boolean.parseBoolean(s3.nextLine());
            //////////////////////////Centre object///////////////////////
            // centreId
            int centreId = Integer.parseInt(s3.nextLine());
            // centreName
            String centreName = s3.nextLine();
            // centreAddress
            String centreAddress = s3.nextLine();
            // inventory for vaccine
            int inventory = Integer.parseInt(s3.nextLine());
            // centre status
            String status = s3.nextLine();
            Centre place1 = new Centre(centreId, centreName, centreAddress, inventory, status);
            ///////////////////////////////////////////////////////////////
            // empty line seperator
            s3.nextLine();
            Appointment app = new Appointment(user1, date1, date2, dose1, dose2, place1);
            allAppointments.add(app);
         }
      } catch (Exception e) {
         System.out.println("Error in read");
      }
   }

   public static void write() {
      try {
         PrintWriter a = new PrintWriter("people.txt");
         PrintWriter a1 = new PrintWriter("personnel.txt");
         PrintWriter a2 = new PrintWriter("centre.txt");
         PrintWriter a3 = new PrintWriter("appointment.txt");
         // -----------------------People--------------------------
         for (int i = 0; i < allPeople.size(); i++) {
            a.println(allPeople.get(i).getIcno());
            a.println(allPeople.get(i).getPassword());
            a.println(allPeople.get(i).getName());
            a.println(allPeople.get(i).getPhone());
            a.println(allPeople.get(i).isCitizen());
            // Print empty line as seperator
            a.println();
         }
         a.close();
         // -----------------------Personnel-----------------------
         for (int i = 0; i < allPersonnel.size(); i++) {
            a1.println(allPersonnel.get(i).getIcno());
            a1.println(allPersonnel.get(i).getPassword());
            a1.println(allPersonnel.get(i).getPersonnelName());
            // Print empty line as seperator
            a1.println();
         }
         a1.close();
         // ------------------------Centre-------------------------
         for (int i = 0; i < allCentres.size(); i++) {
            a2.println(allCentres.get(i).getCentreId());
            a2.println(allCentres.get(i).getCentreName());
            a2.println(allCentres.get(i).getAddress());
            a2.println(allCentres.get(i).getInventory());
            a2.println(allCentres.get(i).getStatus());
            // Print empty line as seperator
            a2.println();
         }
         a2.close();
         // ----------------------Appointment-----------------------
         for (int i = 0; i < allAppointments.size(); i++) {
            // people object
            a3.println(allAppointments.get(i).getPerson().getIcno());
            a3.println(allAppointments.get(i).getPerson().getPassword());
            a3.println(allAppointments.get(i).getPerson().getName());
            a3.println(allAppointments.get(i).getPerson().getPhone());
            a3.println(allAppointments.get(i).getPerson().isCitizen());
            // end of people object
            a3.println(allAppointments.get(i).getDate1());
            a3.println(allAppointments.get(i).getDate2());
            a3.println(allAppointments.get(i).isDose1());
            a3.println(allAppointments.get(i).isDose2());
            // centre object
            a3.println(allAppointments.get(i).getLocation().getCentreId());
            a3.println(allAppointments.get(i).getLocation().getCentreName());
            a3.println(allAppointments.get(i).getLocation().getAddress());
            a3.println(allAppointments.get(i).getLocation().getInventory());
            a3.println(allAppointments.get(i).getLocation().getStatus());
            // Print empty line as seperator
            a3.println();
         }
         a3.close();
      } catch (Exception e) {
         System.out.println("Error in write");
      }
   }

   public static People checkPeople(String x) {
      // return null if name not found, return name object if found
      for (int i = 0; i < allPeople.size(); i++) {
         if (x.equals(allPeople.get(i).getIcno())) {
            return allPeople.get(i);
         }
      }
      return null;
   }

   public static People checkPeopleContact(String x) {
      // return null if name not found, return name object if found
      for (int i = 0; i < allPeople.size(); i++) {
         if (x.equals(allPeople.get(i).getPhone())) {
            return allPeople.get(i);
         }
      }
      return null;
   }

   public static Personnel checkPersonnel(String x) {
      // return null if name not found, return name object if found
      for (int i = 0; i < allPersonnel.size(); i++) {
         if (x.equals(allPersonnel.get(i).getIcno())) {
            return allPersonnel.get(i);
         }
      }
      return null;
   }
}
