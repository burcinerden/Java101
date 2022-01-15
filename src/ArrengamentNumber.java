import java.util.Scanner;
public class ArrengamentNumber {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

         if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.print("Order of three numbers: " + a + "> " + b + "> " + c);
            } else if (b == c) {
                System.out.println("Order of numbers:" + a + "> " + b + "= " + c);
            } else {
                System.out.println("Order of three numbers:" + a + " > " + c + " > " + b);
            }
        }
        else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("Order of three numbers:: " + b + " > " + a + " > " + c);
            } else if (a == c) {
                System.out.println("Order of three numbers:" + b + "> " + a + "= " + c);
            } else {
                System.out.println("Order of three numbers:" + b + " > " + c + " > " + a);
            }}
        else if ((c > a) && (c > b)) {
                    if (a > b) {
                        System.out.println("Order of three numbers:: " + c + " > " + a + " > " + b);
                    } else if (a == b) {
                        System.out.println("Order of three numbers:: " + c + " > " + a + " =" + b);
                    } else {
                        System.out.println("Order of three numbers:" + c+ " > " + b + " > " + a);
                    }
        }
        else {
            System.out.println("All numbers are equal each other" + a + " = " + b + " = " + c);
        }
        }


    }





