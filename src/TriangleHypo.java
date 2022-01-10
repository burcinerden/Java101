import java.util.Scanner;

public class TriangleHypo {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner side=new Scanner(System.in);
        System.out.print("Please enter the first side of triangle:");
        a=side.nextInt();
        System.out.print("Please enter the second side of triangle:");
        b= side.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.print("Hypotenuse of triangle:"+c);

    }
}