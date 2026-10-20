package Pet;

public class test {
    public static void main(String[] args) {
        person p1 = new person("laowang","78");
        person p2 = new person("laoli","29");
        animal dog = new Dog("12","绿色");
        p1.keeppet(dog);
        dog.eat(dog,"shi");
        animal cat = new Cat("12","蓝");
        p2.keeppet(cat);
        cat.eat(cat,"shi");
    }
}
