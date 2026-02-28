package org.example;

public class AmbulancePatient extends Characters implements IEmergencyCare {

    public AmbulancePatient(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public void admission() { System.out.println("Ambulance Patient: Emergency admission through ER entrance."); }

    @Override
    public void operation() { System.out.println("Ambulance Patient: Undergoing emergency surgery."); }

    @Override
    public void room() { System.out.println("Ambulance Patient: Assigned to ICU room 101."); }

    @Override
    public void treatment() { System.out.println("Ambulance Patient: Receiving intensive care treatment."); }

    @Override
    public void rehabilitation() { System.out.println("Ambulance Patient: Starting post-surgery physical therapy."); }

    @Override
    public void discharge() { System.out.println("Ambulance Patient: Stabilized and discharged."); }
}
