package BonusExam;

public class Fish extends Animal implements Pet{
    private String name = "Fish";
    public Fish(int legs) {
        super(legs);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void play(){
        System.out.println(this.name + " play");
    }
    public void walk(){
        System.out.println("Walk");
    }
    public void eat(String food){
        System.out.println("Eat " + food);
    }
}
