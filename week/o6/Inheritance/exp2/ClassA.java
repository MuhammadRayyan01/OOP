package week.o6.Inheritance.exp2;

public class ClassA {
    protected int X;
    protected int Y;

    public void setX(int x){
        this.X=x;
    }
    public void setY(int y){
        this.Y=y;
    }
    public void getNilai(){
        System.out.println("nilai x: "+X);
        System.out.println("nilai y: "+Y);
    }
    
}
