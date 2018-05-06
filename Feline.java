public abstract class Feline extends Animal{

    private String name;

    public Feline(String nameOfFood, String livesIn, String name) {
        super(nameOfFood, livesIn);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Feline is making noise");
    }

    @Override
    public void eat() {

        System.out.println("Feline is eating");
    }

    @Override
    public void sleep() {

        System.out.println("Feline is sleeping");
    }

    @Override
    public void move() {

        System.out.println("Feline is moving");
    }

    @Override
    public void display() {
        System.out.println(getName()+getLivesIn()+getName());
    }
}
