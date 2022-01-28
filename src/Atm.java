import java.util.Scanner;

public class Atm {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int right=3;
        int select;
        int balance=1500;
        int price;
        String userName,pasword;
while(right>0){
        System.out.print("Enter the username:");
        userName= input.nextLine();
        System.out.print("Enter the password:");
        pasword= input.nextLine();

        if(userName.equals("patika")&&pasword.equals("dev123")){
            System.out.println("Welcome to Kodluyoruz Bank");
            do{
    System.out.println("1-Para yatırma\n"+
            "2-Para çekme\n"+
            "3-Bakiye sorgula\n"+
            "4-Çıkış yap\n");
    System.out.print("Please select the operation that you want:");
    select= input.nextInt();
    switch (select) {
        case 1:
            System.out.print("Enter the amount of money you want to deposit into the account");
            price = input.nextInt();
            balance += price;
           System.out.println("New balance:"+balance);
            break;
        case 2:
            System.out.print("Enter the amount of money you want to withdraw from the account:");
            price = input.nextInt();
            if (price > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= price;
                System.out.println("New balance:"+balance);
            }
            break;
        case 3:
            System.out.println("Balance:" + balance);
            break;
        default:
    }
}while (select!=4);
            System.out.println("See you again..");
            break;
      } else{
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            if(right==0){
                System.out.println("Hesap bloke");
            }
            else{
                System.out.println("Kalan giriş hakkınız:"+right);
            }
        }
        }





    }
}

