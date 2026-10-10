package task.segitiga;

 class Segitiga{
private int sudut;

    public int totalSudut(int sudutA){
        sudut = 180-sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA,int sudutB){
        sudut = 180 -(sudutA + sudutB);
        return sudut;
    }
    public int keliling (int sisiA,int sisiB,int sisiC){
        int keliling = sisiA+sisiB+sisiC;
        return keliling;
    }
    public double keliling (int sisiA,int sisiB){
        double c = Math.sqrt((sisiA* sisiA) + (sisiB * sisiB));
        return c;
    }
} 

 class tesSegitiga{
    public static void main(String[] args) {
        Segitiga a = new Segitiga();
    System.out.println(a.totalSudut(45));
    System.out.println(a.totalSudut(30,30));
    System.out.println(a.keliling(3, 4,5));
    System.out.println(a.keliling(3, 4));
    }
}