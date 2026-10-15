package quizandexam.midterm;

public class Robot {
    public String Name;
    public int CPUSpeed;
    public int Power;
public Robot (String name,int cpuSpeed,int power){
    this.Name=name;
    this.CPUSpeed=cpuSpeed;
    this.Power=power;
}
    public void increasePower(){
        Power+=10;
    }
    public void reducePower(){
        Power-=10;
    }

    
}
