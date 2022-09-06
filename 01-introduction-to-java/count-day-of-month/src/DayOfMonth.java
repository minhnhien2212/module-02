import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Month: ");
        a = sc.nextInt();
        switch (a) {
            case 2:
                System.out.println("Month " + a + " has 28 or 29 days.");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Month " + a + " has 31 days.");
                break;
            default:
                System.out.println("Month " + a + " has 30 days.");
                break;
        }
    }
}
