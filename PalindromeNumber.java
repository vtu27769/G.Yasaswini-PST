import java.util.Scanner;

interface Palindrome {
    boolean check(int n);
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Palindrome p = (n) -> {
            int original = n;
            int reverse = 0;

            while(n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }

            return original == reverse;
        };

        if(p.check(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}