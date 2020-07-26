package Polimorfismo.Application;


import Polimorfismo.Domain.AbsStaffMember;
import Polimorfismo.Domain.Employee;
import Polimorfismo.Domain.Volunteer;
import Polimorfismo.Persistence.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class JobsController {

    private EmployeeRepository repository = new EmployeeRepository();

    public JobsController(){

    }

    public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
        Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
        repository.addMember(boss);
    }

    public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
        Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
        repository.addMember(employee);
    }

    public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
        Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
        repository.addMember(manager);
    }


    public void payAllEmployeers() {
        List<AbsStaffMember> employeesList;
        employeesList = repository.getAllMembers();
        for (AbsStaffMember employee : employeesList) {
            employee.pay();
        }
    }

    public List<AbsStaffMember> getAllEmployees() {
        return repository.getAllMembers();
    }

    public void createVolunteer(String name, String address, String phone) {
        Volunteer volunteer;
        try {
            volunteer = new Volunteer(name, address, phone, "no salary");
            repository.addMember(volunteer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
