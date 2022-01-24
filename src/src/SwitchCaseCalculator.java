package src;

import java.util.Scanner;
public class SwitchCaseCalculator {
    public static void main(String[]args) {
        int n1,n2;
        String operator;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a first number:");
        n1=input.nextInt();
        System.out.print("Enter a second number:");
        n2=input.nextInt();
        System.out.println("Please select operation operator\nOperators:+,-,*,/" );
        operator=input.next();

        switch (operator){
            case "+":
                System.out.println("Sum:"+(n1+n2));
                break;
            case "-":
                System.out.println("Substruction:"+(n1-n2));
                break;
            case "*":
                System.out.println("Multiplication:"+(n1*n2));
                break;
            case "/":

                if( n2!=0) {
                    System.out.println("Division:" + (n1 / n2));
                }
                else{
                    System.out.println("No number can be divided by zero");
                }break;
            default:
                System.out.println("Please enter the valid operator!");
        }

    }

}