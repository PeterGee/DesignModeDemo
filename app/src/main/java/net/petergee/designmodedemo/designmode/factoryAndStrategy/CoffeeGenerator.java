package net.petergee.designmodedemo.designmode.factoryAndStrategy;

import java.util.Iterator;
import java.util.Random;

/**
 * Created with zhenghongtao.
 * Date: 2018/3/21
 * Time: 下午2:40
 * Description:
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = new Class[]{Americano.class, Breve.class, Cappuccino.class, Latte.class, Mocha.class};

    public CoffeeGenerator(){}

    private int size = 0;
    public CoffeeGenerator(int sz) {
        size = sz;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[new Random().nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 内部类
    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            // no implemention
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {

       CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffeeGenerator.next());
        }

        for (Coffee c : new CoffeeGenerator(5)) {
            // 策略操作
            System.out.println(c);
        }
    }
}
