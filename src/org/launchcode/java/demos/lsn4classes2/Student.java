package org.launchcode.java.demos.lsn4classes2;

public class Student extends Account {

    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String firstName, String lastName, int numberOfCredits, double gpa) {
        super(firstName, lastName);
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0);
    }

    public String getGradeLevel() {
        if (this.numberOfCredits < 30) {
            return "Freshman";
        } else if (this.numberOfCredits < 60) {
            return "Sophomore";
        } else if (this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int courseCredits, double grade) {
        double qualityScore = this.gpa * this.numberOfCredits;
        qualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = qualityScore / this.numberOfCredits;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

//    public String toString() {
//        return this.firstName + " (ID: " + this.studentId + ", " + this.gpa + " GPA)";
//    }

}
