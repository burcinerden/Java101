package src;

import java.util.Scanner;
public class BodyIndex {
    public static void main(String[]args){

        double index,height,weight;
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the your weight(kg):");
        weight=inp.nextDouble();
        System.out.print("Enter the your height(m):");
        height=inp.nextDouble();
        index=weight/(height*height);
        System.out.println("Your body index is:"+index);

    }

}
