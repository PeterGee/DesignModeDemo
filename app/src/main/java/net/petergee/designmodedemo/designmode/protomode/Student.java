package net.petergee.designmodedemo.designmode.protomode;

import java.util.ArrayList;

/**
 *  原型设计模式
 *
 * @author petergee
 * @date 2018/3/23
 *
 * clone方法创建的对象不会重新走构造方法，对于构造方法比较耗时的操作中，clone效率更高
 * 浅拷贝：Object的clone方法默认是执行浅拷贝，Object类的clone方法只会拷贝对象中的基本的数据类型，
 *        对于数组、集合、容器对象、引用对象等都不会拷贝
 *
 * 深拷贝：深拷贝会将引用数据类型进行拷贝，不会出现新拷贝对象对于原对象的影响问题
 *
 *
 *
 *  优点 ：
 *  1、原型模式是在内存二进制流的拷贝，要比直接 new 一个对象性能好很多，
 *  特别是要在一个循环体内产生大量的对象时，原型模式可以更好地体现其优点。
 *
 *  缺点 ：
 *  1、这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的，在实际开发当中应该注意这个潜在的问题。
 *    优点就是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑。
 *
 */

public class Student implements Cloneable {
    private ArrayList<String> list = new ArrayList<>();
    private String name;
    private int age;

    public Student() {
        System.out.println("lalala   构造方法");
    }

    @Override
    protected Student clone() {
        try {
            Student student = (Student) super.clone();
            student.age = this.age;
            student.name = this.name;
            //浅拷贝

           student.list = this.list;

            //深拷贝  深拷贝不改变
            //student.list= (ArrayList<String>)this.list.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void add(String language) {
        this.list.add(language);
    }

    public void showStudent() {
        System.out.println("Student name is " + this.name + "  age is " + this.age);
        for (String s : list) {
            System.out.println("i am good at  " + s);
        }
    }
}
