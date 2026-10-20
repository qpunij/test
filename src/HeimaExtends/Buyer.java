package HeimaExtends;

public class Buyer extends AdminStaff{
    private String responsible;

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Buyer() {

    }

    public Buyer(String name, String number, String workdetail, String responsible) {
        super(name, number, workdetail);
        this.responsible = responsible;
    }
}
