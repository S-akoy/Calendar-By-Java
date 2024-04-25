import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create a LocalDate Class,and get right time.
        LocalDate localDate = LocalDate.now();
        //get the value of element
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(day);
        //set the localdate to the first day of the month
        LocalDate standard_date = localDate.minusDays(day - 1);
        int dayOfWeek = standard_date.getDayOfWeek().getValue();
        int dayofMonth = standard_date.getDayOfMonth();
        //set the head of calendar
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        //leave the front blank
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("    ");
        }
       int flag = dayofMonth;
        //loop the day of calendar
        while (dayofMonth < standard_date.lengthOfMonth()+1 && flag <= 30) {
            flag++;
            //Specifiy the format of calendar
            if(standard_date.getDayOfMonth() < 10) {
                if(standard_date.getDayOfMonth() == day){
                    System.out.print(dayofMonth + "*   ");
                }
                else
                System.out.print(dayofMonth + "   ");
                //enter the blank line
                if(standard_date.getDayOfWeek().getValue() % 7 == 0) {
                    System.out.println();
                };
            }
            //Specifiy the format of calendar
            if(standard_date.getDayOfMonth() >= 10) {
                if(standard_date.getDayOfMonth() == day){
                    System.out.print(dayofMonth + "* ");
                }
                else
                    System.out.print(dayofMonth + "  ");
                //enter the blank line
                if(standard_date.getDayOfWeek().getValue() % 7 == 0) {
                    System.out.println();
                };
            }
            standard_date = standard_date.plusDays(1);
            dayofMonth = standard_date.getDayOfMonth();
        }
    }
}
