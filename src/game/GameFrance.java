package game;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;
import java.util.Random;

public class GameFrance extends JFrame implements KeyListener , ActionListener {
    int [][] temparr =new int[4][4];
    int [] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int x = 0;
    int y = 0;
    JMenuItem restartgame = new JMenuItem("重新游戏");
    JMenuItem restartlogin = new JMenuItem("重新登录");
    JMenuItem exitgame = new JMenuItem("关闭游戏");
    JMenuItem gongzhonghao = new JMenuItem("公众号");
    public GameFrance(){
        initjframe();
        //初始化菜单
        initjmenubar();
        initdata();
        initimage();

        this.setVisible(true);








    }
    public void initdata(){


        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int index = r.nextInt(arr.length);
            arr[i] = arr[index];
            arr[index] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==0){
                x = i/4;
                y = i%4;

            }
            temparr[i/4][i%4] = arr[i];
        }

    }
public void initimage(){
this.getContentPane().removeAll();
    if(victory(temparr)){
        System.out.println("胜利");
    }

    for (int  q = 0;q<4;q++) {
        for (int i = 0;i<4;i++) {
            int a = temparr[q][i];
            ImageIcon icon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\girl\\girl1\\"+a+".jpg");
            JLabel j = new JLabel(icon);
            j.setBounds(105*i+83,105*q+100,105,105);
            j.setBorder(new BevelBorder(1));
            this.getContentPane().add(j);

        }

    }
    this.getContentPane().repaint();
    this.getContentPane().revalidate();

}
    private void initjmenubar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu function = new JMenu("功能");
        JMenu about  = new JMenu("关于我们");

        jMenuBar.add(function);
        jMenuBar.add(about);
        function.add(restartgame);
        function.add(exitgame);
        function.add(restartlogin);

        about.add(gongzhonghao);
        this.setJMenuBar(jMenuBar);
restartgame.addActionListener(this);
restartlogin.addActionListener(this);
exitgame.addActionListener(this);
gongzhonghao.addActionListener(this);

    }

    private void initjframe() {
        //取消默认放置
        this.setLayout(null);
        this.setSize(608,608);

        this.setTitle("单机游戏1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
//按下不松
    @Override
    public void keyPressed(KeyEvent e) {
int a = e.getKeyCode();
if(a==65){
    System.out.println("nh");
    this.getContentPane().removeAll();
    JLabel j = new JLabel(new ImageIcon("image/girl/girl1/all.jpg"));
    j.setBounds(100,100,300,300);
    this.getContentPane().add(j);

}
this.getContentPane().repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {
int a = e.getKeyCode();
        System.out.println(a);
        if(a ==38){
            if(x==3){
                return;
            }
            temparr[x][y] = temparr[x+1][y];
            temparr[x+1][y] = 0;
            x++;
            System.out.println("上");
            initimage();
        } else if (a==37) {
            if(y==3){
                return;
            }
            temparr[x][y] = temparr[x][y+1];
            temparr[x][y+1] = 0;
            y++;
            System.out.println("左");
            initimage();
        } else if (a==39) {
            if(y==0){
                return;
            }
            temparr[x][y] = temparr[x][y-1];
            temparr[x][y-1] = 0;
            y--;
            System.out.println("右");
            initimage();
        } else if (a==40) {
            if(x==0){
                return;
            }
            temparr[x][y] = temparr[x-1][y];
            temparr[x-1][y] = 0;
            x--;
            System.out.println("下");
            initimage();
        } else if (a==65) {
            initimage();
        }

    }
    public boolean victory(int[][]a){
        int c[][] = new int[4][4];
        int [] b = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < b.length; i++) {

            c[i/4][i%4] = b[i];
        }
        for (int i = 0; i < a.length; i++) {

            for (int i1 = 0; i1 < a.length; i1++) {
                if(a[i][i1]!=c[i][i1]){
return false ;
                }

            }

        }
return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o==restartgame){
            System.out.println("重新游戏");
            initdata();
            initimage();
        } else if (o==restartlogin) {
            System.out.println("重新登录");
this.setVisible(false);
new LoginFance();

        } else if (o==exitgame) {
            System.out.println("退出游戏");
            System.exit(0);

        } else if (o==gongzhonghao) {
            System.out.println("公众号");
            ImageIcon i  = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\girl\\girl2\\all.jpg");
JLabel j = new JLabel(i);
JDialog D = new JDialog(this);
j.setBounds(0,0,200,200);

            D.setLayout(null);
            D.setAlwaysOnTop(true);
            D.setLocationRelativeTo(this);
            D.setSize(300,300);
D.getContentPane().add(j);


D.setVisible(true);

        }
    }
}
