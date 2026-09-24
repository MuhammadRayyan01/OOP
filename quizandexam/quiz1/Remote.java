package quizandexam.quiz1;

public class Remote {
    private String language;
    private int batteryNumber;

    public Remote(String language,int batteryNumber){
        this.language=language;
        this.batteryNumber=batteryNumber;

    }
    public void setLang(String language){
        this.language=language;
    }
    public String getLang(){
        return language;
    }
    public void setBattery(int batteryNumber){
        this.batteryNumber=batteryNumber;
    }
    public int getBattery(){
        return batteryNumber;
}
}
