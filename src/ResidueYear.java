import java.util.Scanner;
public class ResidueYear {
    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in);
        int year;
        boolean residue = false;

        System.out.print("Enter the year:");
        year = inp.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    residue = true;
                } else {
                    residue = false;
                }
            } else {
                residue = true;
            }
        } else {
            residue = false;
        }
        if (residue) {
            System.out.println(year + "is residue year");
        } else {
            System.out.println(year + " is not residue year");
        }
        {

        }


    }
}

