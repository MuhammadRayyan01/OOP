package week.o6.Inheritance.exp6;

public class Inheritance1 {
    public static void main(String[] args) {
        Manager M=new Manager();
        M.Name="Vivvin";
        M.Address="Jl.Vionova";
        M.Age=20;
        M.Jk="perempuan";
        M.Gaji=20000000;
        M.tunjangan=1000000;
        M.showDataManager();
System.out.println("===============");
        Staff S= new Staff();
        S.Name="Poppini";
        S.Address="Jl.kirimaru";
        S.Age=19;
        S.Jk="Laki";
        S.Gaji=20000000;
        S.Lembur=1000000;
        S.Potongan=5678987;
        S.showDataStaff();
System.out.println("===============");
        StaffTetap St= new StaffTetap("Budi","Malang","Laki",20,2000000,25000000,1000000,"2A",1000000);
        St.showDataStaffTetap();
        
System.out.println("===============");
        StaffHarian Sh= new StaffHarian("Indah","Malang","Perempuan",27,10000,1000000,500000,100);
        Sh.showDataStaffHarian();
    }
}
