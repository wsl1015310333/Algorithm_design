package 设计模式.建造者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class HouseModel {
    private List<String>OrderList=new ArrayList<>();

    //建造房屋的步骤，不分先后，不同的房屋，顺序不同
    protected  abstract  void buildstepA();
    protected  abstract  void buildstepB();
    protected  abstract  void buildstepC();
    /*
 建造房屋
  */
    final  public void build(){
        for (int i=0;i<this.OrderList.size();i++){
            String name =this.OrderList.get(i);
            if (name.equalsIgnoreCase("stepA")){
                this.buildstepA();
            }else if (name.equalsIgnoreCase("stepB")){
                this.buildstepB();
            }else if (name.equalsIgnoreCase("stepC")){
                this.buildstepC();
            }
        }

    }
    //设置顺序
    public void setOrderList(List<String> orderList) {
        OrderList = orderList;
    }
}
