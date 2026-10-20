package Inter1;

public interface English {
    public abstract void    speakingenglish();
    public default void  speaking(){
        System.out.println("默认方法");
    }
}
