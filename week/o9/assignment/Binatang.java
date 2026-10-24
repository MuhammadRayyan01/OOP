package assignment;
public abstract class Binatang {
    protected String Nama;
    protected int JmlKaki;

    public Binatang (String nama, int jmlKaki){
        this.Nama=nama;
        this.JmlKaki=jmlKaki;
    }
    public void setNama(String nama){
        this.Nama=nama;
    }
    public String getNama(){
        return Nama;
    }
    public void setKaki(int jmlKaki){
        this.JmlKaki=jmlKaki;
    }
    public int getKaki(){
        return JmlKaki;
    }
    public void displayBinatang() {
        System.out.println("Name: " + this.Nama);
        System.out.println("Number of Legs: " + this.JmlKaki);
    }
}
/*Type: Herbivore
Food: Plants
Name: Keledai
Number of Legs: 4
Sound: Hehehehe
Fur Colour: Grey */