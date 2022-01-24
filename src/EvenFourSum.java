import java.util.Scanner;

public class EvenFourSum {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a,sum=0;
        do {
            System.out.print("Enter the even number:");
            a = input.nextInt();

            if((a % 4 == 0)){
                sum+=a;
            }
        }while (a%2==0);
        System.out.println("Sum of number that you wanted:"+sum);

    }
}
