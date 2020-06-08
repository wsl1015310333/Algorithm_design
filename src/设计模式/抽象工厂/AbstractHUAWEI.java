package 设计模式.抽象工厂;

public abstract class AbstractHUAWEI {
    //华为手机共同的方法，比如品牌
    public void commonMethod(){

    }
    //相同的方法，不同的实现。比如尺寸，型号等等
    public abstract  void  dosomething();
}
