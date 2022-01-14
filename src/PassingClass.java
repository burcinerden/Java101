import java.util.Scanner;

    public class PassingClass{
        public static void main(String[] args) {
            // Create variables
            int math,physics,chemisty,turkish,music;
            int counter=0;
            double total=0;
            Scanner inp=new Scanner(System.in);
            //Get values from user

            System.out.print("Math notes:");
            math=inp.nextInt();
            if (math>=0&&math<=100){
             total+=math;
             counter++;}
            else{
                System.out.println("Enter a valid number!Math scores were not even averaged. ");
            }

            System.out.print("Physics notes:");
            physics=inp.nextInt();
            if (physics>=0&&physics<=100){
                total+=physics;
                counter++;}
            else{
                System.out.println("Enter a valid number!Physics scores were not even averaged. ");
            }

            System.out.print("Chemistry notes:");
            chemisty=inp.nextInt();
            if (chemisty>=0&&chemisty<=100){
                total+=chemisty;
                counter++;
            }
            else{
                System.out.println("Enter a valid number!Chemistry scores were not even averaged. ");
            }

            System.out.print("Turkish notes:");
            turkish=inp.nextInt();
            if (turkish>=0&&turkish<=100){
                total+=turkish;
                counter++;
            }
            else{
                System.out.println("Enter a valid number!Turkish scores were not even averaged. ");
            }

            System.out.print("Music notes:");
            music=inp.nextInt();
            if (music>=0&&music<=100){
                total+=music;
                counter++;
            }
            else{
                System.out.println("Enter a valid number!Music scores were not even averaged. ");
            }

            double average=total/counter;
            System.out.println("Total:"+total+"\nValid lessons of number:"+counter+"\nAverage of lessons:"+average);

           if (average>=55){
               System.out.println("You passed the class");

           }else{
               System.out.println("You failed the class!");
           }
        }

    }

