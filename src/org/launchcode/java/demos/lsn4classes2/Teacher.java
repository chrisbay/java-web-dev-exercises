package org.launchcode.java.demos.lsn4classes2;

public class Teacher extends Account {

    private String subject;
    private int yearsTeaching;
    private String honorific;

    public Teacher(String firstName, String lastName, String honorific, String subject, int yearsTeaching) {
        super(firstName, lastName);
        this.honorific = honorific;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    // teacher.getDisplayName();
    @Override
    public String getDisplayName() {
        return this.honorific + " " + this.getFirstName() + " " + this.getLastName();
    }
}
