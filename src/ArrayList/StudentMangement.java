package ArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentMangement {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
      loop:  while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录2注册3忘记密码");
            Scanner sc1 = new Scanner(System.in);
            String choose1 = sc1.next();
            switch (choose1) {
                case "1" -> {
                    login(user);
                    break loop;
                }
                case "2" -> register(user);
                case "3" -> forget(user);
                default -> System.out.println("没有这个选项");
            }
        }
        ArrayList<student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----------欢迎来到黑马程序系统---------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addstudent(list);
                case "2" -> deletestudent(list);
                case "3" -> updatestudent(list);
                case "4" -> querystudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //注册
    public static void register(ArrayList<User> usre) {
        System.out.printf("注册");
        User user = new User();
        Scanner sc2 = new Scanner(System.in);
        loop1:
        while (true) {
            System.out.println("请输入用户名字");
            String username = sc2.next();
            int count = 0;
            boolean s = username.length() <= 15 && username.length() >= 3;
            for (int i = 0; i < usre.size(); i++) {
              if(username.equals(usre.get(i).getUsername())){
                  System.out.println("用户已经存在");
                  count++;
              }

            }
            boolean count1 = count==0;
            //判断长度
char c[]  =username.toCharArray();
            boolean b = false;
            for (int i = 0; i < c.length; i++) {

                if(('a' <= c[i] && c[i] <= 'z') || ('A' <= c[i] && c[i] <= 'Z') || ('0' <= c[i] && c[i] <= '9')){

                }
                else {

                    count++;
                    System.out.println("fwef");
                }//判断纯数字

                if(('a' <= c[i] && c[i] <= 'z') || ('A' <= c[i] && c[i] <= 'Z')){
                 b = true;
                }
            }


            boolean d = s&&b;
            if(count!=0||!b){
                System.out.println("用户名不符合要求");
            }else {
                user.setUsername(username);
                break loop1;
            }

        }
        //判断密码
       loop2: while (true) {
            System.out.println("请输入密码");
            String password1 = sc2.next();
            System.out.println("请再次输入密码");
            String password2 = sc2.next();
            if(password2.equals(password1)){
                user.setPassword(password2);
                break loop2;
            }else {
                System.out.println("两次密码不匹配");
            }
        }
        //判断身份证
       loop3: while (true) {
            System.out.println("请输入身份证号码");

            String peopel = sc2.next();
         char b[] = peopel.toCharArray();
            boolean a = peopel.length()==18;
            boolean c = b[0]!='0';
            boolean n = a&&c;
            int count = 0;
            for (int i = 0; i < b.length-1; i++) {
                if(!(b[i]>='0'&&b[i]<='9')){
                    count++;
                }
            }
            boolean v = (b[b.length-1]>='0'&&b[b.length-1]<='9')||(b[b.length-1]=='x'||b[b.length-1]=='X');
            boolean m=  v&&count==0;
            boolean k = m&&n;
            if(k){
                user.setPeoplenumber(peopel);
                break loop3;
            }
        }
       loop4: while (true) {
            System.out.println("请输入手机号");
            String phonenumber = sc2.next();
            StringBuilder number  = new StringBuilder(phonenumber);
            char d[] = phonenumber.toCharArray();
            boolean length =  phonenumber.length()==11&&d[0]!='0';
            boolean c = true;
            for (int i = 0; i < d.length; i++) {
               if( d[i]<='9'&&d[i]>='0'){

               }else
               {
                   c = false;
               }


            }
            if(c&&length){
                user.setPhonenumber(phonenumber);
                break loop4;
            }
        }
        usre.add(user);

       }
public  static void login(  ArrayList<User>users){
        Scanner sc = new Scanner(System.in);
    System.out.println("登录");
    System.out.println("请输入用户名");
    String username = sc.next();
    boolean c = false;
    int count  = 0;
    for (int i = 0; i < users.size(); i++) {
       if( username.equals(users.get(i).getUsername())){
           c = true;
           count     = i;
       }
    }
    if(!c){
        System.out.println("用户不已存在");
        register(users);
        return;
    }
    int count1 = 0;
   loop1: while (true) {
        System.out.println("请输入密码,忘记密码扣1");
        String s = sc.next();
        switch (s){
            case "1"->{
                forget(users);
                System.out.println("请重新输入新密码");
            }
        }

        String password =s ;
        boolean d =password.equals(users.get(count).getPassword());

        if(!d){
            System.out.println("密码错误");
            count1++;
            if (count1==3) {
                login(users);
                return;
        }}
        else
        {break loop1;}
    }

    while (true) {
        String yanzm = check();
        System.out.println("验证码："+yanzm);
        System.out.println("请输入验证码");
        String check = sc.next();
        if(!check.equalsIgnoreCase(yanzm))
        {

        }else {break;}
    }
}
//验证码生成
public static String check(){
    Random r = new Random();
    char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
            'n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    StringBuilder str  = new StringBuilder();
    for (int i = 0; i < 4; i++) {
        int f = r.nextInt(52);

str.append(c[f]);
    }
    int g = r.nextInt(4);
    str.insert(g,r.nextInt(10));
    return str.toString();
}
//忘记密码
    public static void forget(ArrayList<User>users) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("忘记密码了");
            System.out.println("请输入用户id");
            String username = sc.next();
            int count=-1;
            boolean o = true;
            for (int i = 0; i < users.size(); i++) {
                if (username.equals(users.get(i).getUsername())) {
                    count = i;
                }
            }
            if (


                    count==-1
            ) {
                System.out.println("未注册,请注册");
                register(users);
            }
            loop1:
            while (true) {
                System.out.println("请输入身份证号码");
                String sfz = sc.next();
                System.out.println("请输入手机号码");
                String number = sc.next();
                boolean s = (sfz.equals(users.get(count).getPeoplenumber()) && number.equals(users.get(count).getPhonenumber()));
                if (s) {
                    System.out.println("请输入新密码");
                    String newpassword = sc.next();
                    users.get(count).setPassword(newpassword);
                    System.out.println("修改成功");
                    break loop1;
                } else {
                    System.out.println("信息不匹配修改失败");
                }
            }
        }
    }
    //添加学生
    public static void addstudent(ArrayList<student> list){
        Scanner sc = new Scanner(System.in);
        student s = new student();
        while (true) {
            System.out.println("请输入id");
            String id=sc.next();
            if(contains(list,id)) {

                System.out.println("已经存在请重新输入");
            }else {
                s.setID(id);
                break;
            }
        }

        //
        System.out.println("请输入姓名");
        String name = sc.next();
        s.setName(name);
        //
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        s.setAge(age);
        //
        System.out.println("请输入地址");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
        System.out.println("添加成功");

    }
    //删除学生
    public static void deletestudent(ArrayList<student> list){
Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生id");
String s = sc.next();
if(deletebase(list,s)>=0){
    list.remove(deletebase(list,s));
}
else {
    System.out.println("删除学生不存在");
}
    }
    //修改学生
    public static void updatestudent(ArrayList<student> lsit){
Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的id");
String id = sc.next();
int q = deletebase(lsit,id);
if(q==-1){
    System.out.println("要修改的"+id+"不存在");
    return;
}
        System.out.println("请输入要修改的名字");
String newname = sc.next();
lsit.get(q).setName(newname);
//
        System.out.println("请输入要修改年龄");
        int newage = sc.nextInt();
        lsit.get(q).setAge(newage);
        //
        System.out.println("请输入要修改的地址");
        String newaddress  = sc.next();
        lsit.get(q).setAddress(newaddress);
        System.out.println("修改成功");
    }
    //查询学生
    public static void querystudent(ArrayList<student> list){
        if(list.size()==0){
            System.out.println("当前无学生信息");
            return;

        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            student stu =list.get(i);
            System.out.println(stu.getID()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }

    }
    //查询id
    public static boolean contains(ArrayList<student> list,String id){

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getID();
            if(s.equals(id)){
                return true;
            }
        }
        return false;
    }
    //返回id对应位置
    public static int deletebase(ArrayList<student> list,String id){
        for (int i = 0; i < list.size(); i++) {

           String is  = list.get(i).getID();
           if(is.equals(id)){
               return i;
           }
        }
        return -1;
    }
}
