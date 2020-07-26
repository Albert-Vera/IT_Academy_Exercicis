package Polimorfismo.Application;


import Polimorfismo.Domain.IPaymentRate;

public class PaymentFactory{



    public static IPaymentRate createPaymentRateBoss( ){

         return salaryPerMonth -> salaryPerMonth*1.5;
    }

    public static IPaymentRate createPaymentRateEmployee( ){
         return salaryPerMonth -> salaryPerMonth*1.15;
    }
    public static IPaymentRate createPaymentRateManager( ){
         return salaryPerMonth -> salaryPerMonth*1.1;
    }
}

