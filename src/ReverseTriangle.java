import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Burçin Erden
        int n;
        System.out.print("Enter the number of triangle row:");
        n = scan.nextInt();

        for (int i = n ; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}