package week.o6.Inheritance.dnd;

public class Angel extends Character{
    public Angel(String name,int level,int health,int potion){
        name=name;
        level=level;
        health=health;
        potion=potion;
    }
    public void cure(Character target){
        target.health = 100;
        potion-=1;
    }
}
