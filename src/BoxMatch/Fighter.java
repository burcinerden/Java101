package BoxMatch;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
   double StartChance;

    Fighter(String name,int damage,int health,int weight,double dodge, double StartChance){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge=dodge;
        this.StartChance=StartChance;

    }
    int hit(Fighter foe){
        System.out.println(this.name+" =>"+foe.name+" "+this.damage+" damaged");
        if(foe.isDodge()){
            System.out.println(foe.name+" blocked incoming damage.");
            return foe.health;
        }
        if(foe.health-this.damage<0){
            return 0;
        }
     return foe.health-this.damage;
    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }
    public boolean startChance(){
        double randomStartNumber = Math.random() * 100;
        return randomStartNumber <= this.StartChance;
    }



}
