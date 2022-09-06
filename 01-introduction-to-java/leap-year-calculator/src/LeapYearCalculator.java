import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " is leap year.");
            } else {
                if (year % 400 == 0) {
                    System.out.println(year + " is leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
