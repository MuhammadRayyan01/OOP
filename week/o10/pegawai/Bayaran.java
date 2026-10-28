package o10.pegawai;

public class Bayaran {
    public int hitungBayaran(Pegawai peg){
        int uang = peg.getGaji();
        if(peg instanceof Manajer){
            uang += ((Manajer)peg).getTunjangan();
        }else if(peg instanceof Manajer){
            uang += ((Programmer)peg).getBonus();
        }
        return uang;
    }
    
}
