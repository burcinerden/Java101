
import java.util.Scanner;
import java.util.Arrays;
public class ArrSorting {

    static void scan(int[] arr,Scanner input){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + ". element : ");
            arr[i] = input.nextInt();
        }
    }
    static void sorting(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = input.nextInt();
        int[] list = new int[n];

        scan(list,input);
        sorting(list);

    }
}
