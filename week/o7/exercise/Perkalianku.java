package week.o7.exercise;

public class Perkalianku {
    void Perkalian(int a,int b){
        System.out.println(a*b);
    }
    void Perkalian(int a,int b,int c){
        System.out.println(a*b*c);
    }
    public static void main(String[] args) {
        Perkalianku obj1 = new Perkalianku();
        obj1.Perkalian(2, 3);
        obj1.Perkalian(2, 3, 4);
    }
}
