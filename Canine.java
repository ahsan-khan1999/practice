public abstract class Canine extends Animal{

    private String goodname;

    public Canine(String nameOfFood, String livesIn, String goodname) {
        super(nameOfFood, livesIn);
        this.goodname = goodname;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    @Override
    public void eat() {

        System.out.println("Canine is eating");
    }

    @Override
    public void makeNoise() {

        System.out.println("Canine is MAking noise");
    }

    @Override
    public void sleep() {

        System.out.println("Canine is sleeping");
    }

    @Override
    public void move() {

        System.out.println("canine is moving");
    }


    @Override
    public void display() {
        System.out.println(goodname+getLivesIn()+getNameOfFood());
    }
}
