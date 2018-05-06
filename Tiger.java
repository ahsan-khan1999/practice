public class Tiger extends Feline{

    private String nameTiger;

    public Tiger(String nameOfFood, String livesIn, String name, String nameTiger) {
        super(nameOfFood, livesIn, name);
        this.nameTiger = nameTiger;
    }

    public String getNameTiger() {
        return nameTiger;
    }

    public void setNameTiger(String nameTiger) {
        this.nameTiger = nameTiger;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Tiger eat");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Tiger noise");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Tiger move");

    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Tiger Sleep");
    }

    @Override
    public void display() {
        super.display();
        System.out.println(nameTiger);
    }
}
