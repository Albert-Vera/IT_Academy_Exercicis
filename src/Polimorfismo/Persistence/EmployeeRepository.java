package Polimorfismo.Persistence;


import Polimorfismo.Domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private static List<Employee> members=new ArrayList<>();

    public EmployeeRepository(){

    }

    public List<Employee> getAllMembers(){

        //return new ArrayList<>(members);
        return members;
    }


    public void addMember(Employee member) throws Exception{
        if(member==null) throw new Exception();
        members.add(member);
    }

}
