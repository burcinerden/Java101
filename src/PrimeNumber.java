import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int sayac = 0;
        for(int number=2;number<=100;number++)
        {
           boolean control = true;
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    control = false;
                    break;
                }
            }
            if(control)
            {
                System.out.print(number+" ");
                sayac++;
            }
        }
    }


}
