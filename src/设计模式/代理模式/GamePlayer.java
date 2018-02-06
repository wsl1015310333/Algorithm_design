package 设计模式.代理模式;

import com.sun.tools.javac.util.Log;

public class GamePlayer implements  AbstractPlayer {
    private String name="";
    public  GamePlayer(String name){
        this.name=name;

    }
    @Override
    public void playGame() {
        System.out.println("qzs"+"        Log.format(\"qzs\",\"玩游戏-刷级\");\n");
        Log.format("qzs","玩游戏-刷级");
    }
}
