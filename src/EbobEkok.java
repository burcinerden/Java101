import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter the n1:");
        n1 = input.nextInt();
        System.out.print("Enter the n2:");
        n2 = input.nextInt();

        int ebob = 1;
        int j = 1;
        if (n1 < n2) {
            while (j <= n1) {
                if (n1 % j == 0 && n2 % j == 0) {
                    ebob = j;
                }
                j++;
            }
            System.out.println("EBOB : " + ebob);
        } else {
            while (j <= n2) {
                if (n1 % j == 0 && n2 % j == 0) {
                    ebob = j;
                }
                j++;
            }
            System.out.println("Ebob : " + ebob);
        }
        int ekok = 1;
        int i = 1;
        while(i <= n1 * n2){
            if(i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
            i ++ ;
        }
        System.out.println("Ekok : " +ekok);

    }
}
