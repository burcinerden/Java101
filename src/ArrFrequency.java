
import java.util.Arrays;
public class ArrFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int counter =1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    counter++;
                }
            }
            if(arr[i] != arr[i+1]) {
                System.out.println(arr[i] + " sayısı " + counter + " kez tekrar edildi. ");
            }

           if(arr[i] == arr[arr.length-1]&& i == arr.length-2  ) {
                System.out.println(arr[arr.length-1] + " sayısı " + counter + " kez tekrar edildi. ");
            }

            counter = 1;

            }





        }



    }












