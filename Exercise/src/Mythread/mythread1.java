package Mythread;

public class mythread1 extends  Thread{
    static  int i =0;
    @Override
    public void run() {

        while (true) {
            synchronized (mythread1.class) {

                if (i < 100) {
                    i++;
                    System.out.println(getName() + "在买第" + i + "张票");
                } else {
                    break;
                }
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
