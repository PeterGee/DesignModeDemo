package net.petergee.designmodedemo.designmode.template;

/**
 * @author geqipeng
 * @date 2018/3/6
 */

public abstract class Programmer {

    public final void doTemplateMethod() {
        //打卡
        clockIn();
        //工作
        work();
        //下班
        offDuty();
    }

    protected void clockIn() {
        System.out.println("上班");
    }

    protected void work() {
        System.out.println("工作");
    }

    protected void offDuty() {
        System.out.println("下班");
    }


}
