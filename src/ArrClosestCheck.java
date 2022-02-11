
import java.util.Arrays;
import java.util.Scanner;
public class ArrClosestCheck {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int[] arr={15,12,788,1,-1,-778,2,0};
        int [] arrNew1=new int[arr.length];
        int [] arrNew2=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        int n;
        int min=arrNew1[0];
        int max=arrNew1[0];
        System.out.print("Enter a number:");
        n= inp.nextInt();

        for(int i=0;i< arr.length;i++){
            if(arr[i]<n){
                max=arr[i];
                arrNew1[i]=max;
            }
        }
        for(int j=0;j< arrNew1.length;j++){
            if(arrNew1[j]>max&&arrNew1[j]!=0)
            {
                max=arrNew1[j];
            }
        }
        //System.out.println(Arrays.toString(arrNew1));
        for(int i=0;i< arr.length;i++){
            if(arr[i]>n){
                min=arr[i];
                arrNew2[i]=min;
            }
        }
        for(int j=0;j< arr.length;j++){
            if(arrNew2[j]<min&&arrNew2[j]!=0)
            {
                min=arrNew2[j];

            }
        }
        //System.out.println(Arrays.toString(arrNew2));

        System.out.println("The nearest number smaller than the entered number:"+max);
        System.out.println("The nearest number greater than the entered number:"+min);



    }



    }

