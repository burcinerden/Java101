
import java.util.Scanner;
public class MaxMin {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n= input.nextInt();
        int number;
            int max,min;
            System.out.print("1.Enter the number:");
            number=input.nextInt();
            min=number;
            max=number;
            for (int i = 2; i < (n+1); i++) {
                System.out.print(i+"-Enter the number:");
                number=input.nextInt();
                if(number<min){
                    min=number;
                }
                if (number>max){
                    max=number;
                }
            }
            System.out.println("Maximum value: "+max);
            System.out.println("Minimum value: "+min);
        }



    }


