package mythresh;

import java.time.LocalDate;
import java.util.Scanner;
public class LeapYear {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the year: ");
      int year = sc.nextInt();
      System.out.println("Enter the month: ");
      int month = sc.nextInt();
      System.out.println("Enter the day: ");
      int day = sc.nextInt();
      
      LocalDate givenDate = LocalDate.of(year, month, day);
      
      boolean bool = givenDate.isLeapYear();
     
      if(bool){
         System.out.println("Your Date of Birth is " + day +"-"+ month +"-"+ year + " and is was a leap year");
      }else{
         System.out.println("Your Date of Birth is " + day +"-"+ month +"-"+ year + " and is was not a leap year ");
      }
      sc.close();
   }
}