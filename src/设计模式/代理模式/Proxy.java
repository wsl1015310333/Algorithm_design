package 设计模式.代理模式;

public class Proxy implements AbstractPlayer {//静态代理
    private  GamePlayer gamePlayer=null;

    public Proxy(GamePlayer gamePlayer){
        this.gamePlayer=gamePlayer;

    }
    @Override
    public void playGame() {
        this.gamePlayer.playGame();

    }

}
