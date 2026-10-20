package HeimaExtends;

public class AdminStaff extends Employee{
    private String workdetail;

    public AdminStaff() {

    }

    public AdminStaff(String name, String number, String workdetail) {
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
