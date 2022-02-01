package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {

        Student jack = new Student("Jackson", 42, 3, 4.0);
        Teacher chris = new Teacher("Chris", "Bay", "Dog Dad", 5);
        Course howToSit = new Course("How to sit", chris);
        howToSit.enrollStudent(jack);

    }
}
