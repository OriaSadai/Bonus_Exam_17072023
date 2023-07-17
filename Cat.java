package BonusExam;

public class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name, int legs) {
        super(legs);
        this.name = name;

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
    @Override
    public void eat(String food){
        System.out.println("Eat " + food);
    }
}
