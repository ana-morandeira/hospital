package org.example;

public class SpecialistDoctor extends Doctor {
    private String specialty;

    public SpecialistDoctor(String id, String firstName, String lastName, String specialty) {
        super(id, firstName, lastName);
        this.specialty = specialty;
    }

    @Override public void workHoursPerWeek() { System.out.println("Specialist works 40h."); }
    @Override public void eat() { System.out.println("Eating at doctor's lounge."); }
    @Override public void vacations() { System.out.println("30 days of vacation."); }

    public void specialtyMethod() { System.out.println("Performing " + specialty + " consultation."); }

    public String getSpecialty() {
    }
}

