package org.example;

public abstract class Doctor extends Characters implements IWorkable {
    public Doctor(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}