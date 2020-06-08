package 设计模式.抽象工厂;

public class Factory2 extends AbstractFactory {
    @Override
    public AbstractHUAWEI createSize1() {
        return new HUAWEI_A2();
    }

    @Override
    public AbstractMI createSize2() {
        return new MI_B2();
    }
}
