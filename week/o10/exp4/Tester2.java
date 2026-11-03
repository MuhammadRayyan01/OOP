package week.o10.exp4;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp= new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
       

        System.out.println(e.getEmployeeInfo());
        System.out.println(pEmp.getEmployeeInfo());
    }
    
}
