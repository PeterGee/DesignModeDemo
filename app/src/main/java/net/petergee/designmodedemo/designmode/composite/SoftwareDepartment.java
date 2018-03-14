package net.petergee.designmodedemo.designmode.composite;

import java.util.ArrayList;

/**
 * @author geqipeng
 * @date 2018/3/8
 */

public class SoftwareDepartment implements IMember {

    private ArrayList<IMember> list = new ArrayList<>();

    public SoftwareDepartment() {
        list.add(new JavaDeveloper());
        list.add(new AndroidDeveloper());
        list.add(new JsDeveloper());
    }

    @Override
    public int getMemberCount() {
        int memberCount=0;
        for (IMember member:list){
            memberCount+=member.getMemberCount();
        }
        return  memberCount;
    }
}
