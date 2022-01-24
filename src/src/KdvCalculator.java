package src;

import java.util.Scanner;
public class KdvCalculator {
    public static void main(String[]args){
        double number,KdvRate,KdvAmount,Sum;
        Scanner input=new Scanner(System.in);

        System.out.print("Please enter the number that you want to calculate the KDV amount:");
        number= input.nextDouble();
        boolean comparator=number>=1000;
        KdvRate=comparator ?0.08 : 0.18 ;


        System.out.println(comparator ? "KDV ratio:%8":"KDV ratio:%18");
        KdvAmount=number*KdvRate;
        Sum=number+KdvAmount;
        System.out.println("KDV free value of entered number:"+number);
        System.out.println("KDV value of entered number:"+KdvAmount);
        System.out.println("Sum of KDV amount of entered number and entered number:"+Sum);









    }
}
