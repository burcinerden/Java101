package src;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double km,perKm=2.20,startPrice=10.0,total;
        Scanner distance=new Scanner(System.in);
        System.out.println("Taximeter starting price is:"+startPrice);
        System.out.println("Enter the distanance in km:");
        km= distance.nextDouble();
        total=startPrice+(km*2.20);
        total=(total<20)? 20: total;
        System.out.print("The amount you have to pay:"+total);


    }

}
