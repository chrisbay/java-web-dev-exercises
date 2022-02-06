package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

/**
 * Created by Chris Bay
 */
public abstract class Account {

    private static int nextId = 1;

    private int id;
    private String firstName;
    private String lastName;

    public Account(String firstName, String lastName) {
        this();
        this.firstName= firstName;
        this.lastName = lastName;
    }

    private Account() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return this.firstName + " " + this.lastName;
    }


    // equals is provided by the Object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName;
    }
}
