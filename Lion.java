public class Lion extends Feline{

    private String nameLion;

    public Lion(String nameOfFood, String livesIn, String name, String nameLion) {
        super(nameOfFood, livesIn, name);
        this.nameLion = nameLion;
    }

    public String getNameLion() {
        return nameLion;
    }

    public void setNameLion(String nameLion) {
        this.nameLion = nameLion;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Lion eat");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Lion noise");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Lion move");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Lion sleep");
    }

    @Override
    public void display() {
        super.display();
        System.out.println(nameLion);
    }
}
