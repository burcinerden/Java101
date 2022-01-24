package src;

import java.util.Scanner;

public class ChinaZodiac {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int birthYear;
        int residue;



        System.out.print("Enter the your birth year:");
        birthYear= input.nextInt();
        residue=birthYear%12;
        if(residue==0){
            System.out.println("Your chinese zodiac sign:Monkey");
        }
        else if(residue==1){
            System.out.println("Your chinese zodiac sign:Rooster");
        }
        else if(residue==2){
            System.out.println("Your chinese zodiac sign:Dog");
        }
        else if(residue==3){
            System.out.println("Your chinese zodiac sign:Pig");
        }
        else if(residue==4){
            System.out.println("Your chinese zodiac sign:Mouse");
        }
        else if(residue==5){
            System.out.println("Your chinese zodiac sign:Oaf");
        }else if(residue==6){
            System.out.println("Your chinese zodiac sign:Tiger");
        }
        else if(residue==7){
            System.out.println("Your chinese zodiac sign:Rabbit");
        }
        else if(residue==8){
            System.out.println("Your chinese zodiac sign:Dragon");
        }
        else if(residue==9){
            System.out.println("Your chinese zodiac sign:Snake");
        }
        else if(residue==10){
            System.out.println("Your chinese zodiac sign:Horse");
        }else if(residue==11){
            System.out.println("Your chinese zodiac sign:Sheep");
        }
        else {
            System.out.println("Enter a valid number!");
        }


    }
}
