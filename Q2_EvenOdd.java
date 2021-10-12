
// Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class Q2_EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        NumberIsEvenOdd(num);
    }

    static int NumberIsEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        return num;
    }
}
