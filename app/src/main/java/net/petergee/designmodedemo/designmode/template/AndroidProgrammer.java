package net.petergee.designmodedemo.designmode.template;

/**
 * @author geqipeng
 * @date 2018/3/6
 */

public class AndroidProgrammer extends Programmer {
    //重写父类方法
    @Override
    protected void work() {
        System.out.println("写Android程序");
    }
}
