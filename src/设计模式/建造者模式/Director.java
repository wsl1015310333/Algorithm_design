package 设计模式.建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private List<String> OrderList=new ArrayList<>();
    private  OrdinaryhouseBuilder ordinaryhouseBuilder=new OrdinaryhouseBuilder();
    private  VillaBuilder villaBuilder=new VillaBuilder();
    /*
    普通房屋建造步骤封装
    */
    public OrdinaryhouseModel getHouseModel(){
        this.OrderList.clear();
        this.OrderList.add("stepC");
        this.OrderList.add("stepB");
        this.OrderList.add("stepA");
        this.ordinaryhouseBuilder.setOrderList(OrderList);
        return (OrdinaryhouseModel) this.ordinaryhouseBuilder.getHouseModel();
    }
    /*
    别墅建造步骤封装
     */
    public VillaModel getvillaModel(){
        this.OrderList.clear();
        this.OrderList.add("stepA");
        this.OrderList.add("stepB");
        this.OrderList.add("stepC");
        this.villaBuilder.setOrderList(OrderList);
        return (VillaModel) this.villaBuilder.getHouseModel();
    }
    public static void main(String[]args){
        Director director=new Director();
        director.getHouseModel().build();
        director.getvillaModel().build();
    }
}
