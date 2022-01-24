package src;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[]args){
        String userName,password;
        Scanner user=new Scanner(System.in);

        System.out.print("Enter a user name:");
        userName=user.nextLine();
        System.out.print("Enter a password:");
        password=user.nextLine();

        if(userName.equals("Burcin")&&password.equals("Java101"))
        {
            System.out.println("You're logged in");
        }
       else {
            System.out.println("User name,password or both of wrong");
            if (userName.equals("Burcin")){
                System.out.println("You entered wrong password.Would you like the change password?");
            System.out.print("Enter a new password:");
            password=user.nextLine();
                     if(password.equals("Java101")){
                         System.out.println("The new password cannot be the same as the old passwords!");
                         System.out.println("Failed to create password!");}
                     else{
                             System.out.println("The new password had created.");
                         }
            }
            else{
                System.out.println("You entered wrong username!");
            }
        }


    }

}
