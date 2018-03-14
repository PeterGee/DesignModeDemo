package net.petergee.designmodedemo.designmode.MyOberver;

/**
 * @author geqipeng
 * @date 2018/3/13
 */

public class ObserverTest {
    public static void main(String[] args){
        PM pm=new PM();
        Programmer programmerA=new Programmer("乔布斯");
        Programmer programmerB=new Programmer("比尔盖茨");
        pm.addObserver(programmerA);
        pm.addObserver(programmerB);
        pm.notifyAllObserver("写代码");
    }
}
