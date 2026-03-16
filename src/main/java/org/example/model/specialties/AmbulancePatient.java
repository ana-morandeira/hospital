package org.example.model.specialties;

import org.example.interfaces.IEmergencyCare;
import org.example.model.people.Patient;

public class AmbulancePatient extends Patient implements IEmergencyCare {
    public AmbulancePatient(String id, String firstName, String lastName) { super(id, firstName, lastName); }

    @Override public void admission() { System.out.println("Emergency ER admission."); }
    @Override public void operation() { System.out.println("Surgery required."); }
    @Override public void room() { System.out.println("ICU Unit."); }
    @Override public void treatment() { System.out.println("Emergency treatment."); }
    @Override public void rehabilitation() { System.out.println("Physical therapy required."); }
    @Override public void discharge() { System.out.println("Patient stable, discharged."); }
}