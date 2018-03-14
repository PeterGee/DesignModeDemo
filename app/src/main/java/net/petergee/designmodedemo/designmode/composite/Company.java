package net.petergee.designmodedemo.designmode.composite;

import java.util.ArrayList;

/**
 * @author geqipeng
 * @date 2018/3/8
 */

public class Company implements IMember {
    private ArrayList<IMember> companyMemberList = new ArrayList<>();

    public Company() {
        companyMemberList.add(new SoftwareDepartment());
        companyMemberList.add(new BusinessDepartment());
    }

    @Override
    public int getMemberCount() {
        int count=0;
        for (IMember member:companyMemberList){
            count+=member.getMemberCount();
        }
        return count;
    }
}
