package ExtendsJavabean;

public class cook extends Employee{
    public cook(String id, double salray, String name) {
        super(id, salray, name);
    }

    public cook() {
    }
    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
