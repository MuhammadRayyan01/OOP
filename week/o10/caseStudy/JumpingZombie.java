package o10.caseStudy;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
         super(health, level);
         }
    @Override protected int damagePerHit() { 
        return 9; 
    }
}
