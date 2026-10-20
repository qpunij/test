package Inter1;

public class person {
    private String age;
    private  String name;

    public person(String age, String name) {
        this.age = age;
        this.name = name;
    }
    public person(){}

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
