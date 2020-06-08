package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 *  surpe 是指 <? super Animal> Animal自己或者父类才可  <? extends Animal>Animal自己或者他的子类
 */
public class SuperExtendsClass {
    private <T> void test(List<? super T> dst, List<T> src){
        for (T t : src) {
            dst.add(t);
        }
    }
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();//不能用Hdog不然会报错
        new SuperExtendsClass().test(animals,dogs);


        List<Dog> dogs1 = new ArrayList<>();
        // 不会报错
        countLegs( dogs1 );
        // 报错
       // countLegs1(dogs1);
    }

    List<Animal> listAnimals1;

    List<? extends Animal> listAnimals2;
    // Dog 是 Animal 的子类
    class Dog extends Animal {
        public int  countLegs(){
         return 0;
        }
    }
    class Animal{

        public int  countLegs(){
            return 0;
        }
    }
class HDog extends Dog{

    }


    static int countLegs (List<? extends Animal > animals ) {
        int retVal = 0;
        for ( Animal animal : animals )
        {
            retVal += animal.countLegs();
        }
        return retVal;
    }
    static int countLegs1 (List< Animal > animals ){
        int retVal = 0;
        for ( Animal animal : animals )
        {
            retVal += animal.countLegs();
        }
        return retVal;
    }



    public <T extends Number> void test1(List<T> dest, List<T> src){

    }
}
