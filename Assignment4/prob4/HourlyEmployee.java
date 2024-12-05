package Assignment4.prob4;

public class HourlyEmployee extends Employee{
    private double  wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours){
        super(firstName, lastName, SSN);
        this.hours= hours;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public  double getPayment() {
        return hours * wage;

    }

    @Override
    public String toString() {
        return super.toString()+  "Hours: " +hours+ "Wage: " +wage;
    }
}
