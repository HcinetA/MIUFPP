package Assignment4.prob2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private float salary;
    private LocalDate hireDate;

    public DeptEmployee(String name, float salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public float computeSalary() {
        return salary;
    }
}