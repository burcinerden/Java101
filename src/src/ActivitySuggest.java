package src;

import java.util.Scanner;
public class ActivitySuggest {
    public static void main(String[]args){
        int heat;
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter the heat:");
        heat=inp.nextInt();
        if(heat>=5&&heat<=25){
            if(heat<=10){
                System.out.println("You can ski");
            }if(heat<=15){
                System.out.println("You can go cinema");
            }else{
                System.out.println("You can go picnic");
            }
        }
        else
           {
                System.out.println("You can go swim");
            }

        }
    }

