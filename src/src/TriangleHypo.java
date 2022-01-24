package src;

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
        System.out.println("Hypotenuse of triangle:"+c);
        // Area of Triangle
        double perimeter=(a+b+c);
        double u=perimeter/2.0;
        double area=u*(u-a)*(u-b)*(u-c);
        double  Area =Math.sqrt(area);
        System.out.println("Area of triangle:"+Area);



    }
}