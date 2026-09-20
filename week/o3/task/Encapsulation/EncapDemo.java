package week.o3.task.Encapsulation;

public class EncapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge <= 30){
            if(newAge<=18){
                age=18;
            }else if(newAge >=30){
            age = 30;
            }
    }
}
}
