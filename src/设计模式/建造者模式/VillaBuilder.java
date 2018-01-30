package 设计模式.建造者模式;

import java.util.List;

public class VillaBuilder extends HouseBuilder{
    private  VillaModel villaModel=new VillaModel();
    @Override
    public void setOrderList(List<String> orderList) {
        this.villaModel.setOrderList(orderList);
    }

    @Override
    public HouseModel getHouseModel() {
        return this.villaModel;
    }
}
