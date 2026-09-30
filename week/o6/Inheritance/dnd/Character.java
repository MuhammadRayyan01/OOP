package week.o6.Inheritance.dnd;

public class Character {
    protected String name;
    protected int level;
    protected int health;
    
    public void attack(Character target){
        target.health-=10;
    }
    public void showStatus(){
        System.out.println("name: "+name);
        System.out.println("level: "+level);
        System.out.println("health: "+health);
    }
    
}
