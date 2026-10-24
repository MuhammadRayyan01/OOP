package assignment;
public class Gorilla extends Binatang implements IKarnivora,IHerbivore{
    private String Suara;
    private String WarnaBulu;

    public Gorilla (String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.Suara=suara;
        this.WarnaBulu=warnaBulu;
    }
@Override
    public void displayMakan() {
        System.out.println("Type: Carnivore + Herbivore");
        System.out.println("Food: Meat + Plants");
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
    }}
/*Type: Herbivore
Food: Plants
Name: Keledai
Number of Legs: 4
Sound: Hehehehe
Fur Colour: Grey */
