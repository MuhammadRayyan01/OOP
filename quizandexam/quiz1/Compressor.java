package quizandexam.quiz1;

public class Compressor {
    private String type;
    private int capacity;

    public Compressor(String type,int capacity){
        this.type=type;
        this.capacity=capacity;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public void setCap(int capacity){
        this.capacity=capacity;
    }
    public int getCap(){
        return capacity;
    }
    
}