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
         // Read the lines in the text file
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
            People user1 = new People(icno, password, name, phone, citizen);
            // Add the data to the array list object in java to read, write, compare easier
            allPeople.add(user1);
         }

      } catch (Exception e) {
         System.out.println("Error in read");
      }
   }

   public static void write() {
      try {
         PrintWriter a = new PrintWriter("people.txt");
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
