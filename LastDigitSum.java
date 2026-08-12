import java.util.Scanner;

interface LastDigitSum {
    int add(int a, int b);
}

public class SumLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        LastDigitSum sum = (x, y) -> (x % 10) + (y % 10);

        System.out.println("Sum of Last Digits = " + sum.add(a, b));

        sc.close();
    }
}