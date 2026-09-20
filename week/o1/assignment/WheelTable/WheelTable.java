package week.one.assignment.WheelTable;

public class WheelTable extends Table {
    private int totalTire;
    private boolean tireBreak;
    public void setTotalTire(int tire){
        totalTire=tire;
    }
    public boolean isBreak(boolean tBreak){ //tBreak = break
        tireBreak=tBreak;
        return tireBreak;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("table tire counted: "+totalTire);
        System.out.println("is the table can be moved?: "+ tireBreak);
        if(tireBreak){
        System.out.println("the table cannot be moved");
        }
        else{
        System.out.println("the table is able to move");
        }
        System.out.println("table development: wheel table");

    }

    
}
