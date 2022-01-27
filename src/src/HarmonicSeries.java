import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int n;
        double result=0.0;
        System.out.print("Enter a number:");
        n=inp.nextInt();
        for(double i=1;i<=n;i++){
           result+=(1/i);
        }
        System.out.println("Harmonic Series of number:"+result);



    }
}
