import java.util.Scanner;
public class RecurcivePrimeNumber {
    static int prime(int n,int i){
        if(i==1){
            return 1;
        }
        if(n%i==0){
            return 0;
        }return prime(n,i-1);
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n,p;
        System.out.print("Enter the number:");
        n=scan.nextInt();
        p=prime(n,n/2);
        if(p==1){
            System.out.println("Prime");
        }else
        {
            System.out.println("Not prime");
        }


    }



}
