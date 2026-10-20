package Pet;

public class person {
    private String name;
    private  String age;
public person(){}
    public person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void keeppet(animal a){
    if(a instanceof Dog) {
        System.out.println("年龄" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的狗");
    } else if (a instanceof Cat) {
        System.out.println("年龄" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的锚");

    }
    }
}
