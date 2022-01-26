
import java.util.Scanner;
public class CombinationCalculator {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
          int n,r;
          int facN=1,facR=1,facD=1;
         System.out.print("Enter a number N:");
        n= input.nextInt();
        for(int i=1;i<=n;i++){
            facN*=i;
        }

        System.out.print("Enter a number R: :");
        r= input.nextInt();
        for(int j=1;j<=r;j++){
            facR*=j;
        }

        for(int k=1;k<=r;k++){
            facD*=k;
        }
        int sonuc = (facN) / (facR * facD);
        System.out.print("C(" + (n) + "," + (r) + ")" + "=" + sonuc);


    }

}
