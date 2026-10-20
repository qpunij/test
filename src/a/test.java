package a;

import java.security.PublicKey;

public class test {
    public static void main(String[] args) {
        method (
            new Animal() {
                @Override
                public void eat() {
                    System.out.println("狗仔吃骨头");
                }
            }
        );
        }

    public static void method(Animal a){
a.eat();
    }
}
