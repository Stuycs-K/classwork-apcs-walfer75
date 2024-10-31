import java.util.Scanner;
import java.util.ArrayList;
 public class Driver {
   public static void main(String[] args) {
     int total = 0;
     Scanner sc1 = new Scanner("This is a bunch of words");
     Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
     while(sc2.hasNext()) {
       total += sc2.nextDouble();
     }
     System.out.println(total);
   }
 }
