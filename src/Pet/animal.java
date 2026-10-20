package Pet;

public class animal {
    private String age;
    private  String color;


    public animal(){}
    public animal(String age, String color) {
        this.age = age;
        this.color = color;

    }




    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat (animal a,String something){
        if(a instanceof Dog) {
            System.out.println(age +"岁的"+color+"颜色的狗两只前腿保住"+something+"猛吃");
        } else if (a instanceof Cat) {
            System.out.println(age+"岁的"+color+"锚眯着眼睛侧着头吃"+something);

        }else {
            System.out.println("没有这种动物");
        }
    }

}
