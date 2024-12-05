package Assignment4.prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, float salary, LocalDate hireDate, double overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public float computeSalary() {
        return super.computeSalary() + (float) (12 * overtimeHours);
    }
}