package models;

public class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public int compareTo(Person anotherPerson) {
        if (this.getPaymentAmount() > anotherPerson.getPaymentAmount()) {
            return 1;
        }
        if (this.getPaymentAmount() < anotherPerson.getPaymentAmount()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
