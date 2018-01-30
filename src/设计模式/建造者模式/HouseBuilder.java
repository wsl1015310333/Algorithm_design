package 设计模式.建造者模式;

import java.util.List;

public abstract class HouseBuilder {
    //为了设置建造顺序
    public  abstract  void  setOrderList(List<String> orderList);

    //获取安排完建造顺序的对应的房屋
    public  abstract  HouseModel getHouseModel();
}
