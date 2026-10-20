package Interface;

public class frog extends Animal implements Interface{
    @Override
    public void eat() {

    }

    @Override
    public void swim() {
        System.out.println("游泳");
    }

    public frog() {
    }

    public frog(String name, String age) {
        super(name, age);
    }
}
