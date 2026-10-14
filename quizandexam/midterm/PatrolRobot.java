package quizandexam.midterm;

public class PatrolRobot extends Robot{
    public Battery RobotBattery;

    public PatrolRobot(String name,int cpuSpeed, int power,Battery roboBattery){
        this.Name="patrol "+name;
        this.CPUSpeed=cpuSpeed;
        this.Power=power;
        this.RobotBattery=roboBattery;

    }
    public void increasePower(){
        Power+=20;
    }
    
}
