package Polimorfismo.Domain;

public class Employee extends AbsStaffMember {

    public double salaryPerMonth;
    public IPaymentRate paymentRate;

    public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
        super(name, address, phone);
        if(salaryPerMonth<0) throw new Exception();
        if(paymentRate==null) throw new Exception();

        this.salaryPerMonth=salaryPerMonth;
        this.paymentRate=paymentRate;
    }
    @Override
    public void pay() {

        setTotalPaid(paymentRate.pay(salaryPerMonth));
    }
}
