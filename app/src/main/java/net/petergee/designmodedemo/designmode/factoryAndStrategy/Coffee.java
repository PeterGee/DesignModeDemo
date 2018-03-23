package net.petergee.designmodedemo.designmode.factoryAndStrategy;

/**
 * Created with zhenghongtao.
 * Date: 2018/3/21
 * Time: 下午2:25
 * Description:
 */
public class Coffee {

    private static long counter = 0;

    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
