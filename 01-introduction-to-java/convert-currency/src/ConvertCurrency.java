import java.util.Scanner;
public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputVND;
        System.out.println("Enter VND units: ");
        inputVND = sc.nextDouble();
        double outputUSD = inputVND / 23000;
        System.out.printf("%.2f%s", outputUSD, " USD");
    }
}

//    Scanner sc = new Scanner(System.in);
//    double inputVND;
//        System.out.println("Enter VND units: ");
//                inputVND = sc.nextDouble();
//                double outputUSD = inputVND / 23000;
//                System.out.println(inputVND + " VND is equal to " + outputUSD + " USD");
