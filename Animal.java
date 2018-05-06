public abstract class Animal {

    private String nameOfFood;
    private String livesIn;

    public Animal(String nameOfFood, String livesIn) {
        this.nameOfFood = nameOfFood;
        this.livesIn = livesIn;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public String getLivesIn() {
        return livesIn;
    }

    public void setLivesIn(String livesIn) {
        this.livesIn = livesIn;
    }

    public abstract void eat();
    public abstract void makeNoise();

    public abstract void sleep();
    public abstract void move();

    public abstract void display();
}
