package o10.caseStudy;

public class Barrier implements Destroyable {
    private int strength;
    public Barrier(int strength) { 
        this.strength = Math.max(0, strength); 
    }
    public int getStrength() { 
        return strength; 
    }
    @Override public void destroyed() { 
        strength = Math.max(0, strength - 9); 
    }
    public String getBarrierInfo() { 
        return "Barrier Strength = " + strength; 
    }
}
