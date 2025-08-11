//Write a Java Program that to print Print Fibonacci Series up to N Terms ?
public class fib {
    public static void main(String[] args) {
        int n = 5;
        if (n <= 0) {
            System.out.println("no");
        } else if (n == 1) {
            System.out.println('1');
        } else {
            int a = 0;
            int b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;

            }
        }

    }
}
