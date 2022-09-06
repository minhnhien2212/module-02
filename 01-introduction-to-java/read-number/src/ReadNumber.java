import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.printf("Type a number above 0 and under 1000: ");
        number = sc.nextInt();
        int numberDivHundred = number / 100;
        switch (numberDivHundred) {
            case 1: System.out.print("one hundred");break;
            case 2: System.out.print("two hundred");break;
            case 3: System.out.print("three hundred");break;
            case 4: System.out.print("four hundred");break;
            case 5: System.out.print("five hundred");break;
            case 6: System.out.print("six hundred");break;
            case 7: System.out.print("seven hundred");break;
            case 8: System.out.print("eight hundred");break;
            case 9: System.out.print("nine hundred");break;
            default: break;
        }
        int numberDivTen = (number % 100) / 10;
        int numberDivOne = ((number % 100) % 10);
        switch (numberDivTen) {
            case 0: break;
            case 1:
                switch (numberDivOne) {
                    case 0: System.out.print("ten"); break;
                    case 1: System.out.print(" eleven"); break;
                    case 2: System.out.print(" twelve"); break;
                    case 3: System.out.print(" thirteen"); break;
                    case 4: System.out.print(" fourteen"); break;
                    case 5: System.out.print(" fifteen"); break;
                    case 6: System.out.print(" sixteen"); break;
                    case 7: System.out.print(" seventeen"); break;
                    case 8: System.out.print(" eighteen"); break;
                    case 9: System.out.print(" nineteen"); break;
                } break;
            case 2: System.out.print(" twenty"); break;
            case 3: System.out.print(" thirty"); break;
            case 4: System.out.print(" forty"); break;
            case 5: System.out.print(" fifty"); break;
            case 6: System.out.print(" sixty"); break;
            case 7: System.out.print(" seventy"); break;
            case 8: System.out.print(" eighty"); break;
            case 9: System.out.print(" ninety"); break;
        }
        switch (numberDivOne) {
            case 1: System.out.print(" and one"); break;
            case 2: System.out.print(" and two"); break;
            case 3: System.out.print(" and three"); break;
            case 4: System.out.print(" and four"); break;
            case 5: System.out.print(" and five"); break;
            case 6: System.out.print(" and six"); break;
            case 7: System.out.print(" and seven"); break;
            case 8: System.out.print(" and eight"); break;
            case 9: System.out.print(" and nine"); break;
        }
    }
}
