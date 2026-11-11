package quizandexam.quiz2;

public class Evil implements Killable {
    @Override 
    public void dead(){
        System.out.println("Evil has been attacked!, by");
    }
    
}
