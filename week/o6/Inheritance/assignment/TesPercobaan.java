package week.o6.Inheritance.assignment;

public class TesPercobaan {
    public static void main(String[] args) {
        TiketKereta tk1= new TiketKereta("KA-001","Andi","Malang","Jakarta",35000,3,"12A");
        TiketDomestik td1= new TiketDomestik("GA-102","Sinta","Surabaya","Denpasar",900000,"Garuda Maskapai",25,250000);
        TiketInternasional ti1= new TiketInternasional("SQ-205","Budi","Jakarta","Singapura",25000000,"Singapore Airlines",20,"C1234567",150000);

        tk1.showKereta();
        td1.showDomestik();
        ti1.showInternasional();
    }
    
}
