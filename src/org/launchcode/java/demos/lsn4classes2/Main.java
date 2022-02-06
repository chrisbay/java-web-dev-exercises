package org.launchcode.java.demos.lsn4classes2;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main (String[] args) {
        Student account1 = new Student("Chris", "Bay");
        Teacher account2 = new Teacher("Jackson", "The Dog", "Mr.", "Being a good boy", 11);

        // example of "polymorphism"
        printAccount(account1);
        printAccount(account2);

        System.out.println(account1 instanceof Student);
    }

    private static void printAccount(Account account) {
        String nameString = account.getDisplayName() + " (" + account.getId() + ")";
        if (account instanceof Student) {

            // cast account to type Student
            Student theStudent = (Student) account;

            System.out.println("Student: " + nameString + " (" + theStudent.getGpa() + ")");
        } else if (account instanceof Teacher) {
            System.out.println("Teacher: " + nameString);
        }
    }

}
