package Polimorfismo.View;

import Polimorfismo.Application.JobsController;
import Polimorfismo.Domain.AbsStaffMember;
import Polimorfismo.Domain.Volunteer;

import java.util.List;

public class Main {



    private static JobsController controller=new JobsController();

    public static void main(String[] args) throws Exception {

        controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
        controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
        controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
        controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666");
        controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);


        controller.payAllEmployeers();

        List<AbsStaffMember> allEmployees=controller.getAllEmployees();

        for ( AbsStaffMember employee: allEmployees) {
            if (employee instanceof Volunteer) {
                System.out.println("EMPLOYEES: " + " \n");
                System.out.println("\t\t\tId: " + employee.getId());
                System.out.println("\t\t\tName " + employee.getName());
                System.out.println("\t\t\tAdress: " + employee.getAddress());
                System.out.println("\t\t\tPhone: " + employee.getPhone());
                System.out.println("\t\t\tSalary Month: " + ((Volunteer) employee).getDescription());
            } else {
                System.out.println("EMPLOYEES: " + " \n");
                System.out.println("\t\t\tId: " + employee.getId());
                System.out.println("\t\t\tName " + employee.getName());
                System.out.println("\t\t\tAdress: " + employee.getAddress());
                System.out.println("\t\t\tPhone: " + employee.getPhone());
                System.out.println("\t\t\tSalary Month: " +  employee.getTotalPaid());
            }



        }
    }

}

