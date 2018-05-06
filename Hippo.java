public class Hippo extends Animal{

    private String nameHippo;

    public Hippo(String nameOfFood, String livesIn, String nameHippo) {
        super(nameOfFood, livesIn);
        this.nameHippo = nameHippo;
    }

    public String getNameHippo() {
        return nameHippo;
    }

    public void setNameHippo(String nameHippo) {
        this.nameHippo = nameHippo;
    }

    @Override
    public void makeNoise() {
        System.out.println("Hippo Can Make noise");
    }

    @Override
    public void eat() {
        System.out.println("Hippo Can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Hippo Can sleep");
    }

    @Override
    public void move() {
        System.out.println("Hippo Can move");
    }

    @Override
    public void display() {
        System.out.println(nameHippo+getLivesIn()+getNameOfFood());
    }
}
