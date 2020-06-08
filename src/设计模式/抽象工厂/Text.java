package 设计模式.抽象工厂;

public class Text {
    public static void main(String[]args){
        AbstractFactory factory1=new Factory1();
        AbstractFactory factory2=new Factory2();
        //生产A1
        AbstractHUAWEI a1=factory1.createSize1();
          a1.dosomething();
        //生产A2
        AbstractHUAWEI a2=factory2.createSize1();
         a2.dosomething();
        //生产B1
        AbstractMI b1=factory1.createSize2();
          b1.dosomething();
        //生产B2
        AbstractMI b2=factory2.createSize2();
           b2.dosomething();
    }
}
