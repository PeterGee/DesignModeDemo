package net.petergee.designmodedemo.designmode.factory.simpleFactory;

/**
 * @author petergee
 * @date 2018/3/20
 */

public class ProgrammerFactory {

    public static AbstractProgrammer getCodingType(int type){
        switch (type){
            case 1:
                return new JavaProgrammer();
            case 2:
                return new AndroidProgrammer();
            default:
                return new JavaProgrammer();
        }

    }

}
