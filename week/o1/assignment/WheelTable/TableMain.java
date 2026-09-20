package week.o1.assignment.WheelTable;

public class TableMain  {
    public static void main(String[] args) {
    Table meja1= new Table();
    Table meja2= new Table();
    WheelTable mejaroda1= new WheelTable();

    meja1.setColor("grey");
    meja1.setHeight(650);
    meja1.setTableType("dining table");
    meja1.printInfo();

    meja2.setColor("red");
    meja2.setHeight(650);
    meja2.setTableType("study table");
    meja2.printInfo();

    mejaroda1.setColor("chocolate");
    mejaroda1.setHeight(750);
    mejaroda1.setTableType("study table");
    mejaroda1.setTotalTire(4);
    mejaroda1.isBreak(false);
    mejaroda1.printInfo();
    }
}
