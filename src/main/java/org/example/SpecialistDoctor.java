package org.example;

public class SpecialistDoctor extends Characters implements IWorkable {
    private String specialty;

    public SpecialistDoctor(String id, String firstName, String lastName, String specialty) {
        super(id, firstName, lastName);
        this.specialty = specialty;
    }

    // Methods from IWorkable
    @Override
    public void workHoursPerWeek() {
        System.out.println("Specialist " + getFirstName() + " works 40 hours per week.");
    }

    @Override
    public void eat() {
        System.out.println("The specialist is eating in the cafeteria.");
    }

    @Override
    public void vacations() {
        System.out.println("The specialist has 30 days of vacation.");
    }

    // Specific method for this class
    public void specialtyMethod() {
        System.out.println("Performing a specialized procedure in: " + this.specialty);
    }

    // Getter and Setter
    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
}