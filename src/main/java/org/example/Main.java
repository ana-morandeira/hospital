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

        System.out.println("=== HOSPITAL REGISTRY ===\n");

        for (Characters person : hospitalStaffAndPatients) {
            // Información base
            String info = String.format("%-4s | %-20s",
                    person.getId(),
                    person.getFirstName() + " " + person.getLastName());

            // Información específica usando 'instanceof'
            if (person instanceof SpecialistDoctor) {
                SpecialistDoctor doc = (SpecialistDoctor) person;
                info += " | [DOCTOR] Specialty: " + doc.getSpecialty();
            }
            else if (person instanceof org.example.StudentDoctor) {
                org.example.StudentDoctor student = (org.example.StudentDoctor) person;
                info += " | [STUDENT] Grade: " + student.getGrade();
            }
            else if (person instanceof AmbulancePatient) {
                info += " | [EMERGENCY] Arrived by Ambulance";
            }
            else if (person instanceof ConsultationPatient) {
                info += " | [PATIENT] Scheduled Consultation";
            }

            System.out.println(info);
        }
    }
}