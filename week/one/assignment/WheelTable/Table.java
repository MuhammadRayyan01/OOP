package week.one.assignment.WheelTable;

public class Table {
    private String tableColor;
    //hieght in centimeter (100,200,300,...)
    private int tableHeight;
    private String tableType;

    public void setColor(String color){
        tableColor=color;
    }
    public void setHeight(int height){
        tableHeight=height;
    }
    public void setTableType(String type){
        tableType=type;
    }
    public void printInfo(){
        System.out.println("table data");
        System.out.println("table color: "+tableColor);
        System.out.println("table height: "+ tableHeight);
        System.out.println("table type: "+ tableType);
    }
}
