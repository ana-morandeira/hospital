package org.example;

public class StudentDoctor extends Doctor {
    private int studyHours;
    private String currentCourse;

    public StudentDoctor(String id, String firstName, String lastName, int studyHours, String currentCourse) {
        super(id, firstName, lastName);
        this.studyHours = studyHours;
        this.currentCourse = currentCourse;
    }

    @Override
    public void workHoursPerWeek() {
        System.out.println("Student works 20h.");
    }

    @Override
    public void eat() {
        System.out.println("Eating quickly between classes.");
    }

    @Override
    public void vacations() {
        System.out.println("Summer break.");
    }

    public void studyHoursPerWeek() {
        System.out.println("Studying " + studyHours + " hours for " + currentCourse);
    }


    public String getGrade() {
        return this.currentCourse;
    }
}