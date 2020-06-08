package 接口回调;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstActivity {
    public static void  main(String args[]){
        String str1="abc";
        System.out.println(getWeekDateAgo());
        //第一种方式：用类名.class
        Class class1=String.class;

        //第二种方式：用String的对象获取String的字节码
        Class class2=str1.getClass();

        //第二种方式：用String的对象获取String的字节码
        Class class3= null;
        try {
            class3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String  s = "1,2,3,4,5,";
        
        System.out.println("结果如下");
        System.out.println(class1==class2);
        System.out.println(class1==class3);
    }
    public static String getWeekDateAgo(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();

        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, - 7);
        Date d = c.getTime();
        String day = format.format(d);
        return day;
    }

}
