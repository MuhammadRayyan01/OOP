package week.o9.exp3;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

//     Mahasiswa mhsBiasa = new Mahasiswa("Charla");
        Sarjana sarjanaCumlaude = new Sarjana("Dina");
        PascaSarjana masterCumlaude = new PascaSarjana("Elak");


        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude); 
        pakRektor.beriSertifikatMawapres(masterCumlaude);

    }
    
}
