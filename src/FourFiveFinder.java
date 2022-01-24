import java.util.Scanner;

public class FourFiveFinder {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n = scan.nextInt();

        System.out.println("Multiples of 4");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Multiples of 5");
        for (int i = 1; i <= n; i *= 5) {

            System.out.println(i);

        }



    }



    }

