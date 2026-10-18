package ExtendsJavabean;

public class Employee {
    private  String id;
    private  String name;
    private double salray;
public      Employee(){}
    public Employee(String id, double salray, String name) {
        this.id = id;
        this.salray = salray;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalray() {
        return salray;
    }

    public void setSalray(double salray) {
        this.salray = salray;
    }
    public  void eat(){
        System.out.println("吃饭");
    }
    public  void work(){
        System.out.println("工作");
    }

}
