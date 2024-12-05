package Assignment4.prob4;

public class SalariedEmployee extends Employee{
   private double weeklySalary;


   public  SalariedEmployee(String firstName, String lastName, String SSN,double weeklySalary){
       super(firstName, lastName, SSN);
       this.weeklySalary = weeklySalary;
   }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;

    }

    @Override
    public String toString() {
        return super.toString()  +"Weekly Salary: " + weeklySalary ;
    }
}
