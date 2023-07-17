package BonusExam;

public class Spider extends Animal{

    public Spider(int legs) {
        super(legs);
    }
    @Override
    public void eat(String food){
        System.out.println("Eat " + food);
    }
}
