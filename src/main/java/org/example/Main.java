package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Create 2 Doctors of each type
        SpecialistDoctor spec1 = new SpecialistDoctor("S001", "Gregory", "House", "Nephrology");
        SpecialistDoctor spec2 = new SpecialistDoctor("S002", "Meredith", "Grey", "General Surgery");

        StudentDoctor stud1 = new StudentDoctor("ST01", "Shaun", "Murphy", 40, "3rd Year");
        StudentDoctor stud2 = new StudentDoctor("ST02", "John", "Watson", 35, "Final Year");

        // 2. Create 2 Patients of each type
        ConsultationPatient cons1 = new ConsultationPatient("P001", "Tony", "Stark");
        ConsultationPatient cons2 = new ConsultationPatient("P002", "Steve", "Rogers");

        AmbulancePatient amb1 = new AmbulancePatient("E001", "Bruce", "Banner");
        AmbulancePatient amb2 = new AmbulancePatient("E002", "Natasha", "Romanoff");

        // 3. Store them in a list of the superclass (Polymorphism)
        List<Characters> hospitalStaffAndPatients = new ArrayList<>();
        hospitalStaffAndPatients.add(spec1);
        hospitalStaffAndPatients.add(spec2);
        hospitalStaffAndPatients.add(stud1);
        hospitalStaffAndPatients.add(stud2);
        hospitalStaffAndPatients.add(cons1);
        hospitalStaffAndPatients.add(cons2);
        hospitalStaffAndPatients.add(amb1);
        hospitalStaffAndPatients.add(amb2);

        // 4. Print all characters
        System.out.println("--- HOSPITAL MANAGEMENT SYSTEM DATA ---");
        for (Characters character : hospitalStaffAndPatients) {
            System.out.println("ID: " + character.getId() +
                    " | Name: " + character.getFirstName() + " " + character.getLastName() +
                    " | Type: " + character.getClass().getSimpleName());
        }

        System.out.println("\n--- TESTING SPECIFIC ACTIONS ---");
        // Testing an interface method for a doctor
        spec1.workHoursPerWeek();
        // Testing an interface method for an ambulance patient
        amb1.operation();
    }
}