import java.util.Scanner;

public class RecursivePower {
    static int power (int x, int y) {
        if (y == 1) {
            return x;
        }
        return power(x,y- 1) * x;
    }

        public static void main(String[]args){
        int right;
        int base,expo;
        Scanner input=new Scanner(System.in);
            System.out.print("Enter the base number:");
            base= input.nextInt();
            System.out.print("Enter the exponantial number:");
            expo= input.nextInt();

            System.out.println(base+" exponantial "+expo+" = "+power(base,expo));

        }


}


