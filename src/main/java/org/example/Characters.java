package org.example;

// Abstract to prevent direct instantiation (Abstraction principle)
public abstract class Characters {
    // Private attributes (Encapsulation principle)
    private String id;
    private String firstName;
    private String lastName;

    public Characters(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Setters and Getters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}
