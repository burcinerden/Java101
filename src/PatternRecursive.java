import java.util.Scanner;
public class PatternRecursive {
    static int pattern() {
        Scanner input = new Scanner(System.in);
        System.out.print("N number: ");
        int n = input.nextInt();
        int resulti = 1;
        int resultj = 1;
        for (int i = n; i > -n - i; i -= 5) {

            resulti = i;
            System.out.print(resulti+" ");
            if (i <= 0) {
                for (int j = i; j <= n; j += 5) {
                    resultj = j;
                    System.out.print(resultj+" ");
                }

            }
            if (resultj == n) {
                break;
            }
        }
        return 1;
    }
    public static void main(String[] args) {

        System.out.println(pattern());

    }
}