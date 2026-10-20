package HeimaExtends;

public class Employee {
    private String name;
    private  String number;
public Employee(){}
    public Employee(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void  work(){
        System.out.println("工作");
    }

}
