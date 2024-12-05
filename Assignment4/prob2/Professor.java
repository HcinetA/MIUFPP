package Assignment4.prob2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    private int numberOfPublications;

    public Professor(String name, float salary, LocalDate hireDate, int numberOfPublications) {
        super(name, salary, hireDate);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}