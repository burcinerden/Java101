import java.util.Scanner;
public class AverageFor {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int sum = 0;
        int k,average;
        int counter=0;
        System.out.println("Enter the number:");
        k=inp.nextInt();

        for (int i=0;i<=k;i++) {
            if((i%3==0)||(i%4==0)){

                sum+=i;
                System.out.println("numbers:"+i);

                counter++;
            }
        }
        average=(sum/counter);
        System.out.println("sum:"+sum+"\nAverage:"+average);

    }
}
