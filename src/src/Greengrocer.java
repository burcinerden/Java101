package src;

import java.util.Scanner;
public class Greengrocer {
    public static void main(String[] args) {
      double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,eggplant=5.00;
      double p,a,b,e,t;
      Scanner kilos=new Scanner(System.in);

        System.out.print("How many kilos of pear(kg):");
        p= kilos.nextDouble();
        System.out.print("How many kilos of apple(kg):");
        a= kilos.nextDouble();
        System.out.print("How many kilos of tomato(kg):");
        t= kilos.nextDouble();
        System.out.print("How many kilos of banana(kg):");
        b= kilos.nextDouble();
        System.out.print("How many kilos of eggplant(kg):");
        e= kilos.nextDouble();
        double total=(p*pear)+(a*apple)+(t*tomato)+(b*banana)+(e*eggplant);
        System.out.print("Total prices is:"+total);
    }
}