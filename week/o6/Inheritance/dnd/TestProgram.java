package week.o6.Inheritance.dnd;

public class TestProgram {
    public static void main(String[] args)
{
Angel esther = new Angel("Esther", 10, 100, 5);
Human jackal = new Human("Jackal", 13, 100, 7);
Wizard quistis = new Wizard("Quistis", 20, 100, 3);
Furry paddlePop = new Furry("Paddle Pop", 15, 100,  5);

System.out.println("Begin game...");
esther.showStatus();
jackal.showStatus();
quistis.showStatus();
paddlePop.showStatus();

System.out.println("Jackal special attack to quistis,quistis cast magic to jackal,\nesther cure jackal, quistis attack esther...");
jackal.specialAttack(quistis);
quistis.magic(jackal);
esther.cure(jackal);
quistis.attack(esther);
esther.showStatus();
jackal.showStatus();
quistis.showStatus();

System.out.println("Paddle Pop rage out, jackal attack paddle pop");
paddlePop.showStatus();
paddlePop.rage(paddlePop);
paddlePop.showStatus();
jackal.attack(paddlePop);
paddlePop.showStatus();

}
}