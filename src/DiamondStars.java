import java.util.Scanner;

public class DiamondStars {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= inp.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i -1 ); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i =n-1; i >= 1 ; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            } for (int j = 0; j < (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }


    }

