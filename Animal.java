package BonusExam;

public abstract class Animal {
    int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    public void walk(){
        System.out.println("Walk");
    }
    public void eat(String food){
        System.out.println("Eat " + food);
    }
}
