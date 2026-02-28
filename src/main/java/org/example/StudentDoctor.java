package org.example;

public class StudentDoctor extends Characters implements IWorkable {
    private int studyHours;
    private String currentCourse;

    public StudentDoctor(String id, String firstName, String lastName, int studyHours, String currentCourse) {
        super(id, firstName, lastName);
        this.studyHours = studyHours;
        this.currentCourse = currentCourse;
    }

    // Methods from IWorkable
    @Override
    public void workHoursPerWeek() {
        System.out.println("Student doctor " + getFirstName() + " works 20 hours per week (Internship).");
    }

    @Override
    public void eat() {
        System.out.println("The student is eating a quick snack.");
    }

    @Override
    public void vacations() {
        System.out.println("The student has academic holidays.");
    }

    // Method to show study status
    public void studyHoursPerWeek() {
        System.out.println("Studying " + this.studyHours + " hours for course: " + this.currentCourse);
    }

    // Getters and Setters
    public int getStudyHours() { return studyHours; }
    public void setStudyHours(int studyHours) { this.studyHours = studyHours; }
    public String getCurrentCourse() { return currentCourse; }
    public void setCurrentCourse(String currentCourse) { this.currentCourse = currentCourse; }
}