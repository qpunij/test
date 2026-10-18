package girlfriend;

public class test {
    public static void main(String[] args) {
hello20 arr [] = new hello20[3];
hello20 stu1 = new hello20(1,"zhangsan",18);
hello20 stu2 =new hello20(2,"lisi",19);
hello20 stu3 = new hello20(3,"wangwu",20);
arr[0]=stu1;
arr[1]=stu2;
arr[2]=stu3;

    }
    public static int getIndex(hello20[]arr,int id){
        for(int i=0;i<arr.length;i++){
            hello20 stu = arr[i];
            if(stu!=null){
                if(stu.getId()==id) {
                    int sid = stu.getId();
                    return i;
                }
            }

        }
        return -1;
    }
}
