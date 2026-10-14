package quizandexam.midterm;

public class TestPatrolRobot {
    public static void main(String[] args) {
        Battery batt =new Battery();
        PatrolRobot pr = new PatrolRobot("ASIMO",2048 , 150, new Battery(16000));

        pr.increasePower();
        System.out.println("Name: "+pr.Name);
        System.out.println("CPU speed: "+ pr.CPUSpeed);
        System.out.println("Power: "+pr.Power);
        System.out.println(pr.RobotBattery.Capacity);
    }
    
    
}
