public class Dog extends Canine {

    private String nameDog;

    public Dog(String nameOfFood, String livesIn, String goodname, String nameDog) {
        super(nameOfFood, livesIn, goodname);
        this.nameDog = nameDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eat");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Dog make noise");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Dog sleep");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Dog move");
    }

    @Override
    public void display() {
        super.display();
        System.out.println(getNameDog());
    }
}
