package 分治算法;

import java.math.BigInteger;

public class BitIntegerMutiply {

    //例子错误
 public static void main(String[] args){
     String aString="876";
     String bString="49";
     BigInteger aBigInteger=new BigInteger(aString);
     BigInteger bBigInteger=new BigInteger(bString);
     String aResult=aBigInteger.multiply(bBigInteger).toString();
     String bResult=Mutiply(aString,bString);
     System.out.println(aResult+"--"+bResult);
 }
 public static String  Mutiply(String a,String b){
     String result = "";
     if (a.length() == 1 || b.length() == 1)// 递归结束的条件
         //其中一个长度为1，另一个不一定
         result = "" + Long.valueOf(a) * Long.valueOf(b);
     else// 如果2个字符串的长度都 >= 2
     {
         //1.分割成  a1  a0  b1  b0
         int lengthA0 = a.length() / 2;
         int lengthA1=a.length()-lengthA0;
         String a1 = a.substring(0, lengthA1); // 截取前一半的字符串(较短的一半)
         String a0 = a.substring(lengthA1, a.length()); // 截取后一半的字符串

         int lengthB0 = b.length() / 2;
         int lengthB1=b.length()-lengthB0;
         String b1 = b.substring(0, lengthB1);
         String b0 = b.substring(lengthB1, b.length());

         //2.计算展开式中的乘法
         String a1b1 = Mutiply(a1, b1);
         String a1b0 = Mutiply(a1, b0);
         String a0b1 = Mutiply(a0, b1);
         String a0b0 = Mutiply(a0, b0);

         //3.模拟移位
         String resulta1b1 = a1b1;
         for (int i = 0; i < lengthA0+lengthB0; i++) {
             resulta1b1 += "0";
         }
         String resulta1b0 = a1b0;
         for (int i = 0; i <lengthA0; i++) {
             resulta1b0 += "0";
         }
         String resulta0b1 = a0b1;
         for (int i = 0; i < lengthB0; i++) {
             resulta0b1 += "0";
         }


         //4.大数相加
         result = resulta0b1+resulta1b0;
         result = result+resulta0b1;
         result = result+a0b0;


     }
     return result;
 }
}
