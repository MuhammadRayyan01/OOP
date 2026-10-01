package week.o6.Inheritance.dnd;

public class Furry extends Character {
protected int Rage;
public Furry(String name,int level,int health,int rage){
    Name = name;
    Level= level;
    Health= health;
    Rage = rage;
    }
    public void rage(Character Furry){
        Furry.Health +=100;
        Rage-=1;
    }    

}
