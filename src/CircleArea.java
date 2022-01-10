import java.io.PrintStream;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[]args){
        double pi=3.14;
        int r,a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the your circle of radius: ");
        r=input.nextInt();
        System.out.println("Enter the your circle of angle ");
        a=input.nextInt();
        double area=((pi*r*r)*a)/360;
        double primeter=2*pi*r;
        System.out.println("Area of circle piece: "+area);
        System.out.println("Primeter of circle"+primeter);



    }
}
