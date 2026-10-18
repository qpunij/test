package ExtendsJavabean;

public class Manager extends Employee {
    private double bouns;

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public Manager() {

    }

    public Manager(String id, double salray, String name, double bouns) {
        super(id, salray, name);
        this.bouns = bouns;
    }
}
