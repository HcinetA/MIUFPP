package Assignment4.prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String SSN,double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, SSN,commissionRate,baseSalary);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {

        return baseSalary + super.getPayment();
    }

    @Override
    public String toString() {
        return super.toString()+ "baseSalary: " + baseSalary ;
    }
}
