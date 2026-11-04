package o10.caseStudy;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
         super(health, level); 
        }
    @Override protected int damagePerHit() { 
        return 15; 
    }
}
