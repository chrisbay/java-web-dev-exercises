package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

/**
 * Created by Chris Bay
 */
public class Course {

    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        this.enrolledStudents.add(student);
    }

    public String getTopic() {
        return topic;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Teacher getInstructor() {
        return instructor;
    }
}

