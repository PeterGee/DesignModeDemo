package net.petergee.designmodedemo.designmode.MyOberver;

/**
 * @author geqipeng
 * @date 2018/3/13
 */

public class Programmer implements Observer {
    private String mName;
    public  Programmer(String name){
        this.mName=name;
    }
    @Override
    public void update(String str) {
        System.out.println("我是"+mName+"我收到的需求是"+str);
    }
}
