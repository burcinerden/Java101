import java.util.Scanner;
public class SumDigits {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number= input.nextInt();

        int basNumber=0;
        int  tempNumber=number;
        int basValue;
        int total=0;

        while(tempNumber!=0){
           // System.out.println(tempNumber);
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=number;
        while(tempNumber!=0){
            basValue=tempNumber%10;
            System.out.println(basValue);
             total+=basValue;
            tempNumber/=10;
        }
        System.out.print("Sum of all digits:"+total);

    }
}
