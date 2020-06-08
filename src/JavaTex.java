import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaTex {
   volatile   int  i=0;
    public static void  main(String []args){
//        List<String> stringList = new ArrayList<String>();
//        List<Integer> integerList = new ArrayList<Integer>();
//        System.out.println(stringList.getClass()"："+(stringList.getClass() == integerList.getClass()));

        JavaTex javaTex=new JavaTex();
        javaTex.   Changed();
       // int sumtotalz=(int,int)->int={x,y->x+y;}
        int a=9;
        int b=1;
        //int sumtotal=(a , b) -> a + b;
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
        // 使用lambda表达式
        List costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax.stream().map((cost) -> (int)cost + 0.12 * (int)cost).forEach(System.out::println);

Integer i=258;
        Integer ii=i;
        System.out.println(i.equals(ii));

    }
    public void  find(int []parent,int j){

    }

    public void Changed(){
        for (int j = 0; j < 1000; j++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    i++;
                }
            }).start();
        }
        System.out.println(i);
    }
    public List<Integer> getData(List<String> keys) {
        // maybe xxxService.getData(keys);
        List<Integer> result = new ArrayList<Integer>();
        for (String key: keys) {
            result.add(Integer.valueOf(key) % 1000000000);
        }
        return result;
    }
    public List<Integer>getDataLimda(List<String> keys){
        return keys.stream().map(key -> Integer.valueOf(key) % 1000000000).collect(Collectors.toList());

    }

}
