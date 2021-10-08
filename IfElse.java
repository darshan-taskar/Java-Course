import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("Both are Equal");
        } else if (num1 > num2) {
            System.out.println(num1 + ": is greater");
        } else {
            System.out.println(num2 + ": is greater");
        }

    }
}
