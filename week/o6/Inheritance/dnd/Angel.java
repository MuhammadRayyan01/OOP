package week.o6.Inheritance.dnd;

public class Angel extends Character{
    protected int Potion;
    public Angel(String name,int level,int health,int potion){
        Name = name;
        Level = level;
        Health = health;
        Potion=potion;
    }
    public void cure(Character target){
        target.Health = 100;
        Potion-=1;
    }
}
