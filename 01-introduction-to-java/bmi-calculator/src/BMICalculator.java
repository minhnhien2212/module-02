import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height;
        System.out.println("Enter the weight in kilogram: ");
        weight = sc.nextDouble();
        System.out.println("Enter the height in meter: ");
        height = sc.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Your bmi index is " + bmi + ". You are underweight.");
        } else if (bmi >= 18.5 && bmi <25) {
            System.out.println("Your bmi index is " + bmi + ". Your weight is normal.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Your bmi index is " + bmi + ". You are overweight.");
        } else if (bmi >= 30) {
            System.out.println("Your bmi index is " + bmi + ". You are obese.");
        }
    }
}
