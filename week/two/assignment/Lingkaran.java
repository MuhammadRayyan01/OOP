package week.two.assignment;

public class Lingkaran {
    double phi=3.14;
    double r;

    public double hitungLuas(int r){
        System.out.println("Area of circle");
        double Area = phi * r * r;
        return Area;
    }
    public double keliling(int r){
        System.out.println("Perimeter of Circle");
        double perimeter=phi *2*r;
        return perimeter;
    }
    
    
}
