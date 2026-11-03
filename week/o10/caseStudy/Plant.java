package o10.caseStudy;

public class Plant {
    public void doDestroy(Destroyable target) {
        if (target != null) target.destroyed();
    }
}
