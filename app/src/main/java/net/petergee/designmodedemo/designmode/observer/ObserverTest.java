package net.petergee.designmodedemo.designmode.observer;

/**
 * @author geqipeng
 * @date 2018/3/13
 */

public class ObserverTest {
    public static void main(String[] args){
        //创建观察者实例
        Player heroA=new Player("程咬金");
        Player heroB=new Player("老夫子");

        //创建被观察者实例
        TeamLeader leader=new TeamLeader();
        //添加观察者
        leader.addObserver(heroA);
        leader.addObserver(heroB);
        //发布消息
        leader.assignTask("在树林埋伏对面后羿");
        System.out.println("————————————————————————分隔线——————————————————————————————————");
        //删除观察者
        leader.deleteObserver(heroA);
        leader.assignTask("好好发育，不要浪");

    }
}
