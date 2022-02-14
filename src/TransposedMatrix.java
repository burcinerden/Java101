
import java.util.Scanner;
public class TransposedMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number (nxn) for matrix:");
        int n=scan.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println((i+1)+".row "+(j+1)+".column");
                matrix[i][j]= scan.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("-----------Matrix----------");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("--------Transpose Matrix------------");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrix[j][i]);
            }
            System.out.print("\n");
        }



    }
}
