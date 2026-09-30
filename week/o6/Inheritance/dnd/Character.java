package week.o6.Inheritance.dnd;

public class Character {
    protected String Name;
    protected int Level;
    protected int Health;
    
    public void attack(Character target){
        target.Health-=10;
    }
    public void showStatus(){
        System.out.println("name: "+Name);
        System.out.println("level: "+Level);
        System.out.println("health: "+Health);
    }
    
}
