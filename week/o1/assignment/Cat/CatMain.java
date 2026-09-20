package week.o1.assignment.Cat;

public class CatMain {
    public static void main(String[] args) {
        Cat cat1= new Cat();
        Cat cat2= new Cat();

        cat1.setCatColor("black");
        cat1.isCatSleep(true);
        cat1.feedCatHungerFuel(3);
        cat1.printInfo();

        cat2.setCatColor("Mujaer");
        cat2.isCatSleep(false);
        cat2.feedCatHungerFuel(1);
        cat2.printInfo();
    }
    
}
