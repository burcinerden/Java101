import java.util.Scanner;

public class metodCalculator {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number do you want to enter?:");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number do you enter:");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number:");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Divisor can not be zero");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base number :");
        int base = scan.nextInt();
        System.out.print(" :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }
    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;
        int mod;
        mod=n%10;
        System.out.println("Result:"+mod);
    }
    static void rectangular(){
        Scanner scan = new Scanner(System.in);
        System.out.print("1.side of rectangular :");
        int n = scan.nextInt();
        System.out.print("2. side");
        int k= scan.nextInt();
        int result = 1;
        int cevre=2*(n+k);
        int area=n*k;
        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+cevre);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Sum\n"
                + "2- Substruction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential\n"
                + "6- Factorial\n"
                + "7- Mod \n"
                + "8- Rectangular area and perimeter\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please choose the operation:");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                case 0:
                    break;
                default:
                    System.out.println("You entered wrong value!\nPlease try again!");
            }
        } while (select != 0);


    }
}