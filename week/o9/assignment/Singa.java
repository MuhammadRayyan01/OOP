package assignment;
public class Singa extends Binatang implements IKarnivora {
    private String Suara;
    private String WarnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.Suara = suara;
        this.WarnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Type: Carnivore");
        System.out.println("Food: Meat");
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
