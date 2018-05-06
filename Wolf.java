public class Wolf extends Canine{

    private String nameWolf;

    public Wolf(String nameOfFood, String livesIn, String goodname, String nameWolf) {
        super(nameOfFood, livesIn, goodname);
        this.nameWolf = nameWolf;
    }

    public String getNameWolf() {
        return nameWolf;
    }

    public void setNameWolf(String nameWolf) {
        this.nameWolf = nameWolf;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Wolf Eat");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Wolf make Noice");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Wolf sleep");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Wolf move");
    }

    @Override
    public void display() {
        super.display();
        System.out.println(getNameWolf());
    }
}
