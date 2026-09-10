package week.three;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota agt1=new Anggota();
        agt1.setNama("Iwan Setiawan");
        agt1.setAlamat("jalan sukarno hatta no 10");
        agt1.setor(10000);
        System.out.println( "simpanan "+agt1.getNama()+"Rp"+ agt1.getSimpanan());
        agt1.pinjam(5000);
        System.out.println("simpanan "+ agt1.getNama()+ "Rp"+ agt1.getSimpanan());
    }
}
