package task.Manusia;

public class Tes{
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Mahasiswa b = new Mahasiswa();
        Dosen c = new Dosen();

        System.out.println("=========");
        a.bernafas();
        a.makan();
        System.out.println("==========");
        b.makan();
        b.tidur();
        System.out.println("==========");
        c.bernafas();
        c.makan();
        c.lembur();
    }
}