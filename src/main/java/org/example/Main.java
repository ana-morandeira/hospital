package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Characters> hospitalStaffAndPatients = new ArrayList<>();


        hospitalStaffAndPatients.add(new SpecialistDoctor("D01", "Gregory", "House", "Diagnostics"));
        hospitalStaffAndPatients.add(new SpecialistDoctor("D02", "Meredith", "Grey", "General Surgery"));
        hospitalStaffAndPatients.add(new org.example.StudentDoctor("S01", "John", "Dorian", 40, "4th Year"));
        hospitalStaffAndPatients.add(new org.example.StudentDoctor("S02", "Elliot", "Reid", 35, "4th Year"));

        hospitalStaffAndPatients.add(new ConsultationPatient("P01", "Arthur", "Morgan"));
        hospitalStaffAndPatients.add(new ConsultationPatient("P02", "Sadie", "Adler"));
        hospitalStaffAndPatients.add(new AmbulancePatient("E01", "Joel", "Miller"));
        hospitalStaffAndPatients.add(new AmbulancePatient("E02", "Ellie", "Williams"));


        for (Characters person : hospitalStaffAndPatients) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " [ID: " + person.getId() + "]");
        }
    }
}