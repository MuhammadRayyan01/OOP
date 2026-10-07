package exercise.overloading;

public class tesCalculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.tambah(2, 3));          // tambah(int, int)
        System.out.println(c.tambah(2, 3, 4));    // tambah(int, int, int)
        System.out.println(c.tambah(2.5, 3.5));     // tambah(double, double)
        
    }
}
