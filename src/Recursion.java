public class Recursion {

    //阶乘
    private  static  int Find(int data){
        if(data==1) {
            return 1;
        }else{
            return  data*Find(data-1);
        }

    }
    private static int FindTwo(int num1,int num2){
        return 1;
    }

    //1，1，2，3，5，8......第40位的数  前面两位相加 等于后一位

    public static void main(String args[]){
        System.out.println(""+Find(5));
    }
}
