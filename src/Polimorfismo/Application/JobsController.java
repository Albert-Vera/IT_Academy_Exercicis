package Polimorfismo.Application;


import Polimorfismo.Domain.Employee;
import Polimorfismo.Persistence.EmployeeRepository;

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
        double total_salary= 0;
       for ( Employee salarys: repository.getAllMembers()) {
          total_salary += salarys.getSalaryPerMonth();
       }
        System.out.println("\n\nTotal pay all employees: " + total_salary + "\n");
    }

    public List<Employee> getAllEmployees() {
        return repository.getAllMembers();
    }

    public void createVolunteer(String name, String address, String phone ) throws Exception {
        Employee volunteer = new Employee(name, address, phone );
        repository.addMember(volunteer);

    }
}
