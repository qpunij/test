package Interface;

public class dog extends Animal implements Interface{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("gououyong");
    }

    public dog() {
    }

    public dog(String name, String age) {
        super(name, age);
    }
}
