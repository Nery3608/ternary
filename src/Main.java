import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number for A!: ");
        int a = input.nextInt();
        System.out.print("Enter Another number for B!: ");
        int b = input.nextInt();
        int max1 = 5;
        int max2 = 7;

        // TODO: prompt for a number store it in a
        // TODO: prompt for another number store it in b

        System.out.println("Max of 15 and 23: " + findMaximum(15, 23));
        System.out.println("Max of 100 and 50: " + findMaximum(100, 50));
        System.out.println("Max of -5 and -10: " + findMaximum(-5, -10));

        System.out.println("Max of " + a + " and " + b + ": " + findMaximum(a, b));

    }

    public static int findMaximum(int a, int b) {
        // TODO: Use ternary operator to return the maximum
        return (a > b) ? a : b;
    }
}





