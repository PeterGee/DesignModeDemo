package net.petergee.designmodedemo.designmode.factory.simpleFactory;

/**
 * @author petergee
 * @date 2018/3/20
 */

public class SimpleFactoryTest {
    public static void main(String[] args){
        AbstractProgrammer programmer=ProgrammerFactory.getCodingType(1);
        programmer.codingType();


    }
}
