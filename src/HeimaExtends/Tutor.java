package HeimaExtends;

public class Tutor extends Teacher{

    private  String workstyle;

    public Tutor() {

    }

    public Tutor(String name, String number, String workdetail, String workstyle) {
        super(name, number, workdetail);
        this.workstyle = workstyle;
    }

    public String getWorkstyle() {
        return workstyle;
    }

    public void setWorkstyle(String workstyle) {
        this.workstyle = workstyle;
    }
}
