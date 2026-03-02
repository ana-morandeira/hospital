package org.example;

public class ConsultationPatient extends Patient implements IStandardCare {
    public ConsultationPatient(String id, String firstName, String lastName) { super(id, firstName, lastName); }

    @Override public void admission() { System.out.println("Standard admission."); }
    @Override public void nurseControl() { System.out.println("Nurse checking vitals."); }
    @Override public void room() { System.out.println("Room 101."); }
    @Override public void treatment() { System.out.println("Applying standard treatment."); }
    @Override public void nextAppointment() { System.out.println("Next visit in 1 month."); }
    @Override public void discharge() { System.out.println("Discharging consultation patient."); }
}