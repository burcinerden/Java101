package src;

import java.util.Scanner;

public class ExponentialCalculator {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,b;
        int total=1;
        System.out.print("Number:");
        a= input.nextInt();
        System.out.print("Exponent :");
        b= input.nextInt();
        for(int i=1;i<=b;i++) {
            total*=a;
        }
        System.out.println("Number:"+a+"\nExponent:"+b+"\nResult:"+total);
    }
}
