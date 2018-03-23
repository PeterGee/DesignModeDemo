package net.petergee.designmodedemo.designmode.factoryAndStrategy;

/**
 * Created with zhenghongtao.
 * Date: 2018/3/21
 * Time: 下午2:30
 * Description:
 */
public interface Generator<T> {

    // 返回参数化的T
    T next();
}
