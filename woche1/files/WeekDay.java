import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args) {
        System.out.println("Bitte Tag Montag Jahr eingeben (durch Leerzeichen getrennt)");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        int shift = 0;
        int result = 0;       

        // 1. January 1900 was a Monday

        shift = (year-1900) + (year-1900)/4 + (day-1);

        if (month > 1) {
            shift = shift + 31;
        }
        if (month > 2) {
            shift = shift + 28;
        }
        if (month > 3) {
            shift = shift + 31;
        }
        if (month > 4) {
            shift = shift + 30;
        }
        if (month > 5) {
            shift = shift + 31;
        }
        if (month > 6) {
            shift = shift + 30;
        }
        if (month > 7) {
            shift = shift + 31;
        }
        if (month > 8) {
            shift = shift + 31;
        }
        if (month > 9) {
            shift = shift + 30;
        }
        if (month > 10) {
            shift = shift + 31;
        }
        if (month > 11) {
            shift = shift + 30;
        }

        /* In case of January or February of a "Schaltjahr" 
           remove 1 from shift , but only if date is not the first year 1900 (because then the number is correct)*/

        if  ( ((month == 1) || (month == 2)) && (year % 4 == 0) && year != 1900) {
            shift = shift - 1;
        }

        result = shift % 7;

        if (result == 0) {
            System.out.println("Montag");
        }
        if (result == 1) {
                System.out.println("Dienstag");
        }
        if (result == 2) {
            System.out.println("Mittwoch");
        }
        if (result == 3) {
            System.out.println("Donnerstag");
        } 
        if (result == 4) {
            System.out.println("Freitag");
        } 
        if (result == 5) {
            System.out.println("Samstag");
        } 
        if (result == 6) {
            System.out.println("Sonntag");
        } 
    }
}
