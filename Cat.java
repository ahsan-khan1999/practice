public class Cat extends Feline{

    private String nameCat;

    public Cat(String nameOfFood, String livesIn, String name, String nameCat) {
        super(nameOfFood, livesIn, name);
        this.nameCat = nameCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat eat");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Cat eat");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Cat eat");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Cat eat");
    }

    @Override
    public void display() {
        super.display();
        System.out.println(nameCat);
    }
}
