package 设计模式.建造者模式;

public class OrdinaryhouseModel extends HouseModel{
    @Override
    protected void buildstepA() {
        System.out.println("普通房屋建造步骤A操作");
    }

    @Override
    protected void buildstepB() {
        System.out.println("普通房屋建造步骤B操作");
    }

    @Override
    protected void buildstepC() {
        System.out.println("普通房屋建造步骤C操作");
    }
}
