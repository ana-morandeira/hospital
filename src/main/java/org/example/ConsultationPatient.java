package org.example;

public class ConsultationPatient extends Characters implements IStandardCare {

    public ConsultationPatient(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public void admission() { System.out.println("Consultation Patient: Registered at the front desk."); }

    @Override
    public void nurseControl() { System.out.println("Consultation Patient: Nurse checked blood pressure."); }

    @Override
    public void room() { System.out.println("Consultation Patient: Assigned to waiting room B."); }

    @Override
    public void treatment() { System.out.println("Consultation Patient: Receiving outpatient medication."); }

    @Override
    public void nextAppointment() { System.out.println("Consultation Patient: Next appointment scheduled for next month."); }

    @Override
    public void discharge() { System.out.println("Consultation Patient: Discharged. Going home."); }
}