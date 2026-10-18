package ExtendsJavabean;

public class test {
    public static void main(String[] args) {
        Manager m = new Manager("1",2000.0,"mm",4000.0);
        System.out.println(m.getId()+" "+m.getName()+"  "+m.getBouns()+""+m.getSalray());
        m.work();
        cook c = new cook("1",2000.0,"cc");
        System.out.println(c.getId()+" "+c.getName()+" "+c.getSalray());
        c.work();
    }
}
