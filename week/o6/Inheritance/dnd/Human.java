package week.o6.Inheritance.dnd;

public class Human extends Character {
    protected int strength;

    public Human(String name,int level,int health,int strength){
        name = name;
        level = level;
        health = health;
        strength = strength;
    }

    public void specialAttack(Character target){
        target.health = target.health - 10 - strength;
    }
}
