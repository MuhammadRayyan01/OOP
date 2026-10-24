package assignment;
public class Keledai extends Binatang implements IHerbivore{
    private String Suara;
    private String WarnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.Suara = suara;
        this.WarnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Type: Herbivore");
        System.out.println("Food: Plants");
    }

    @Override
    public void displayBinatang() {
        super.displayBinatang();
        System.out.println("Sound: " + this.Suara);
        System.out.println("Fur Colour: " + this.WarnaBulu);
    }

    public void displayData() {
        displayMakan();
        displayBinatang();
        System.out.println();
    }
}
