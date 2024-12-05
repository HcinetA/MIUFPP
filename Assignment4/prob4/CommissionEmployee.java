package Assignment4.prob4;

public class CommissionEmployee extends Employee{
    public double grossSales;
    public double commissionRate;

    public CommissionEmployee (String firstName, String lastName, String SSN, double grossSales, double commissionRate){
        super(firstName,lastName,SSN);
        this.grossSales= grossSales;
        this.commissionRate =commissionRate;

    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commissionRate;

    }

    @Override
    public String toString() {
        return super.toString()+ "Gross Sale: " + grossSales + ", Comission Rate: " + commissionRate ;
    }
}
