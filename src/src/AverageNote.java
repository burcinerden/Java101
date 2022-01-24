package src;

import java.util.Scanner;
public class AverageNote{
public static void main(String[] args) {
   // Create variables
    int math,physics,chemisty,turkish,history,music;
     Scanner inp=new Scanner(System.in);
     //Get values from user

    System.out.print("Math notes:");
    math=inp.nextInt();
    System.out.print("Physics notes:");
    physics=inp.nextInt();
    System.out.print("Chemistry notes:");
    chemisty=inp.nextInt();
    System.out.print("Turkish notes:");
    turkish=inp.nextInt();
    System.out.print("History notes:");
    history=inp.nextInt();
    System.out.print("Music notes:");
    music=inp.nextInt();

    int total=(math+physics+chemisty+turkish+history+music);
    double average=total/6.0;
    System.out.println("Average of Notes:"+average);

    System.out.println(average>100 ? "Please enter a valid number!":"Your result is coming..");
    System.out.println((average>=60 && average<=100) ? "You passed the class": "You failed the class");

}

}
