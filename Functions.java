import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(Addition(num1, num2));

    }

    static int Addition(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
