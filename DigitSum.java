import java.util.Scanner;

interface DigitSum {
    int calculate(int n);
}

public class EvenOddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        DigitSum evenSum = (n) -> {
            int sum = 0;
            while(n > 0) {
                int digit = n % 10;
                if(digit % 2 == 0)
                    sum += digit;
                n /= 10;
            }
            return sum;
        };

        DigitSum oddSum = (n) -> {
            int sum = 0;
            while(n > 0) {
                int digit = n % 10;
                if(digit % 2 != 0)
                    sum += digit;
                n /= 10;
            }
            return sum;
        };

        System.out.println("Even Digit Sum = " + evenSum.calculate(num));
        System.out.println("Odd Digit Sum = " + oddSum.calculate(num));

        sc.close();
    }
}