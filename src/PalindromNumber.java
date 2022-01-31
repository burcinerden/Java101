import java.util.Scanner;
public class PalindromNumber {

    static int isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while ((temp != 0)) {
            //System.out.println("Number=>" + temp);
            lastNumber = temp % 10;
           // System.out.println("Last digit=>" + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
           // System.out.println("New number=>" + reverseNumber);
            temp /= 10;
            //System.out.println("----------------------------");
        }
        if(number==reverseNumber){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");
        }
        return 1;
    }
    public static void main(String[]args){
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        n= scan.nextInt();
        isPalindrom(n);

    }
}