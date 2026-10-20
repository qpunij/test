package HeimaExtends;

public class Teacher extends Employee{
    private  String workdetail;

    public Teacher() {

    }

    public Teacher(String name, String number, String workdetail) {
        super(name, number);
        this.workdetail = workdetail;
    }

    public String getWorkdetail() {
        return workdetail;
    }

    public void setWorkdetail(String workdetail) {
        this.workdetail = workdetail;
    }
}
