package 设计模式.代理模式;

import java.lang.reflect.InvocationHandler;

public class TextMain {
    public static void main(String[] args) {
        //新建一个游戏者
        GamePlayer gamePlayer=new GamePlayer("秦子帅");
        //定义一个代练者
        Proxy proxy=new Proxy(gamePlayer);
        //玩游戏刷级
        proxy.playGame();

        //新建一个游戏者
        AbstractPlayer abstractPlayer=new GamePlayer("秦子帅");

        InvocationHandler invocationHandler=new DynamicProxy(abstractPlayer);
        //类加载器
        ClassLoader classLoader=abstractPlayer.getClass().getClassLoader();
        //动态产生一个代理者

        AbstractPlayer proxy1= (AbstractPlayer)  java.lang.reflect.Proxy.newProxyInstance( classLoader,new Class[]{AbstractPlayer.class},invocationHandler);

        proxy1.playGame();
    }
}
