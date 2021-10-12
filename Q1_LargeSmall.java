
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class Q1_LargeSmall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = in.nextInt();
        System.out.println("Enter the Third Number: ");
        int num3 = in.nextInt();

        LargerNumber(num1, num2, num3);
        SmallerNumber(num1, num2, num3);
    }

    static int LargerNumber(int num1, int num2, int num3) {
        int max = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
            System.out.println("Large Number: " + max);
        } else if (num2 > num3) {
            max = num2;
            System.out.println("Large Number: " + max);
        } else {
            max = num3;
            System.out.println("Large Number: " + max);
        }
        return max;
    }

    static int SmallerNumber(int num1, int num2, int num3) {
        int min = 0;
        if (num1 < num2 && num1 < num3) {
            min = num1;
            System.out.println("Smaller Number: " + min);
        } else if (num2 < num3) {
            min = num2;
            System.out.println("Smaller Number: " + min);
        } else {
            min = num3;
            System.out.println("Smaller Number: " + min);
        }
        return min;
    }
}