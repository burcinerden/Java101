import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n;
        int sum=0;
        System.out.print("Enter a number:");
        n=scan.nextInt();
        for(int i=1;i<n;i++){
            if((n%i==0)){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("Sum of divisions:"+sum);
        if(sum==n){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not perfect number!");
        }



    }
}
