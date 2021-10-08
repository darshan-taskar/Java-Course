import java.util.*;

public class SwitchBreakEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number :");
        int num2 = scan.nextInt();
        System.out.println("Enter the operation do you want to perform :");
        char operation = scan.next().charAt(0);
        int result;

        switch (operation) {
            case ('+'):
                result = num1 + num2;
                System.out.println("Result : " + result);
                break;
            case ('-'):
                result = num1 - num2;
                System.out.println("Result : " + result);
                break;
            case ('*'):
                result = num1 * num2;
                System.out.println("Result : " + result);
                break;
            case ('/'):
                result = num1 / num2;
                System.out.println("Result : " + result);
                break;
            case ('%'):
                result = num1 % num2;
                System.out.println("Result : " + result);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }

}
