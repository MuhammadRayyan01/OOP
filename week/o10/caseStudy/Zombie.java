package o10.caseStudy;

public abstract class Zombie implements Destroyable {
    protected int Health;
    protected final int Level;

    protected Zombie(int health, int level) {
        Health = Math.max(0, health);
        Level = level;
    }

    public int getHealth() { return Health; }
    public int getLevel() { return Level; }

    public void heal() { Health = Math.min(100, Health + 10); }

    @Override public void destroyed() { Health = Math.max(0, Health - damagePerHit()); }
    protected abstract int damagePerHit();

    public String getZombieInfo() {
        return getClass().getSimpleName() + " Data =\nHealth = " + Health + "\nLevel = " + Level;
    }
}
