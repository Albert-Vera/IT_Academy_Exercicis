package Polimorfismo.Persistence;


import Polimorfismo.Domain.AbsStaffMember;
import Polimorfismo.Domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private static List<AbsStaffMember> members=new ArrayList<>();

    public EmployeeRepository(){

    }
    public List<AbsStaffMember> getAllMembers(){

        return new ArrayList<>(members);
    }

    public void addMember(AbsStaffMember member) throws Exception{
        if(member==null) throw new Exception();
        members.add(member);
    }

}
