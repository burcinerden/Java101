
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class RandomGuessComparing {
    public static void main(String[] args) {

        Random rand=new Random();
        int number= rand.nextInt(100);
      //  int number=(int)(Math.random()*100);
        Scanner input=new Scanner(System.in);
        int right=0;
        int selected;
        boolean isWin=false;
        boolean isWrong=false;
        int [] wrong =new int[5];
        System.out.println(number);

        while(right<5){
            System.out.println("Enter the your prediction:");
            selected= input.nextInt();
            if(selected==number){
                System.out.println("True guess:"+number);
                if(isWin){
                    isWin=true;
                }
                break;
            }
            else{

                System.out.println("You entered wrong number!");


                if(selected>number){
                    System.out.println(selected+" number grater than secret number.");
                }else{
                    System.out.println(selected+ "number smaller than secret number");
                }

            }
            if((selected<0)||(selected>99)){

                System.out.println("Enter a valid number between 1-100");
                if(!isWrong){
                    System.out.println("Incorrect entry will be deducted from your right. Remaining right:"+right);
                }
                else{
                    System.out.println("It's too much wrong enter.Remain right:"+right);
                }
                continue;
            }
            wrong[right++]=selected;
            System.out.println("Remain right:"+(5-right));



        }
        if(!isWin){
            System.out.println("You lost..");
        }
        System.out.println(Arrays.toString(wrong));









    }
}
