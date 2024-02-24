import java.util.Scanner;

public class AppConDry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Enter the value of x: ");
        x = input.nextInt();

        System.out.print("Enter the y: ");
        y = input.nextInt();

        System.out.println("The power of " + x + " elevated to " + y + " is " + calculatePower(x,y));
    }

    static public int calculatePower(int base, int exponent) {
        int ans = 1;
        for (int i = 1; i <= exponent; i++) {
            ans *= base;
        }

        return ans;
    }
}
