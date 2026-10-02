package week.o6.Inheritance.exp6;


public class Karyawan {
    public String Name;
    public String Address;
    public int Age;
    public String Jk;
    public int Gaji;

    public  Karyawan(){

    }
    public Karyawan(String name,String address,int age, String jk, int gaji){
        this.Name=name;
        this.Address=address;
        this.Age=age;
        this.Jk=jk;
        this.Gaji=gaji;
    }
    public void showData(){
        System.out.println("nama:"+Name);
        System.out.println("address"+Address);
        System.out.println("age:"+Age);
        System.out.println("Gender:"+Jk);
        System.out.println("Salary:"+Gaji);
    }
    
}
