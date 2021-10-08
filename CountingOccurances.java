import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = in.nextInt();
        System.out.println("Which numbers occurance do you want to count?");
        int o = in.nextInt();

        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == o) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }

}
