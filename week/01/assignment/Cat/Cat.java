package week.one.assignment.Cat;

public class Cat {
    private String catColor;
    private boolean catSleep;
    //the cat is greedy, his max fuel is 6 meal portion, more than 6 he is a chonky cat
    private int catHungerFuel=1;

    public void setCatColor(String color){
        catColor=color;
    }
    public boolean isCatSleep(boolean sleep){
        if(sleep){
            catHungerFuel-=3;
            return catSleep;
        }else{
            catHungerFuel-=2;
        }
        catSleep=sleep;
        return catSleep;
    }
    public int feedCatHungerFuel(int meal){
        catHungerFuel+=meal;
        return catHungerFuel;
    }
    public void printInfo(){
        System.out.println("cat data info:");
        System.out.println("cat color: "+ catColor);
        System.out.println("is the cat sleep?: "+catSleep);
        System.out.println("the cat fuel:"+catHungerFuel);

    }
}
