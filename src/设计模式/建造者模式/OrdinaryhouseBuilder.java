package 设计模式.建造者模式;

import java.util.List;

public class OrdinaryhouseBuilder extends HouseBuilder {
    private  OrdinaryhouseModel ordinaryhouseModel=new OrdinaryhouseModel();
    @Override
    public void setOrderList(List<String> orderList) {
        this.ordinaryhouseModel.setOrderList(orderList);
    }

    @Override
    public HouseModel getHouseModel() {
        return this.ordinaryhouseModel;
    }
}
