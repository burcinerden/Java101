import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, km, age;
        double ticketCost;
        System.out.print("Enter a total km in your trip:");
        km = inp.nextInt();
        ticketCost = km * 0.10;
        System.out.print("Enter a your age:");
        age = inp.nextInt();
        System.out.println("Please enter a ticket type?\n1)One way\n2)Round-trip");
        a = inp.nextInt();

        if (a == 1 || a == 2) {
            if (a == 1) {
                if (age < 12) {

                    ticketCost -= ticketCost * 0.5;
                    System.out.println("Total cost is:" + ticketCost);

                } else if (age >= 12 && age <= 24) {
                    ticketCost -= ticketCost * 0.1;
                    System.out.println("Total cost is:" + ticketCost);
                } else if (age > 65) {
                    ticketCost -= ticketCost * 0.3;
                    System.out.println("Total cost is:" + ticketCost);
                }
            }
            if (a == 2) {
                ticketCost -= ticketCost * 0.2;
                if (age < 12) {
                    ticketCost -= ticketCost * 0.5;
                    System.out.println("Total cost is:" + ticketCost);

                } else if (age >= 12 && age <= 24) {
                    ticketCost -= ticketCost * 0.1;
                    System.out.println("Total cost is:" + ticketCost);
                } else if (age > 65) {
                    ticketCost -= ticketCost * 0.3;
                    System.out.println("Total cost is:" + ticketCost);
                }

            }

        } else {
            System.out.println("Please enter valid number 1 or 2!");
        }

    }
}
