package Assignment4.prob4;

public class TestClass {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new SalariedEmployee("Amin", "Smith", "123-45-6789", 1000.0);
        employees[1] = new CommissionEmployee("Rim", "Brown", "987-65-4321", 5000.0, 0.1);
        employees[2] = new HourlyEmployee("Nour", "White", "456-78-1234", 20.0, 40);
        employees[3] = new BasePlusCommissionEmployee("Tom", "Blue", "654-32-1987", 3000.0, 0.05, 500.0);
        employees[4] = new SalariedEmployee("Emma", "Green", "111-22-3333", 1200.0);

        for (Employee emp : employees) {
            System.out.println(emp.toString());
            System.out.println("Payment: " + emp.getPayment() + "\n");
        }

        Employee maxSalaryEmp = findMaxSalary(employees);
        System.out.println("Employee with the highest salary:");
        System.out.println(maxSalaryEmp.toString());
        System.out.println("Maximum Salary: " + maxSalaryEmp.getPayment());

    }
    public static Employee findMaxSalary(Employee[] col) {
        if (col == null || col.length == 0) {
            return null;
        }
        Employee maxSalaryEmp = col[0];
        for (Employee emp : col) {
            if (emp != null && emp.getPayment() > maxSalaryEmp.getPayment()) {
                maxSalaryEmp = emp;
            }
        }
        return maxSalaryEmp;
    }

}
