package SalaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if(this.salary>1000){
            return  this.salary*0.03;
        }
        else {
            return 0;
        }
    }
    int bonus(){
        if(this.workHours>40){
            int bonus=(workHours-40)*30;
            return bonus;
        }else{
           System.out.println("You dont have any bonus money");
            return 0;
        }
    }
    double raiseSalary(){
        if (2021 - this.hireYear < 10){
            return this.salary * 0.05;
        }
       else if(2021-this.hireYear>9&&2021 - this.hireYear < 20){
            return this.salary * 0.10;
        }
        else{
            return this.salary * 0.15;
        }
    }
       void toStrings(){
            System.out.println("Name:\t"+this.name);
            System.out.println("Salary:\t"+this.salary);
            System.out.println("Work hours:\t"+this.workHours);
            System.out.println("Hire Year:\t"+this.hireYear);
            System.out.println("Tax:\t"+this.tax());
            System.out.println("Bonus:\t"+this.bonus());
            System.out.println("Raise Salary:\t"+this.raiseSalary());
            System.out.println("Salary with tax and bonus:\t"+(bonus()+this.salary-tax()));
            System.out.println("Total Salary : "+(this.salary + bonus()+raiseSalary() - tax()));

        }









}
