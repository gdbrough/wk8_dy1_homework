package models;

import java.util.Set;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private Set<Motorcycle> motorcycles;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public Set<Motorcycle> getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(Set<Motorcycle> motorcycles) {
        this.motorcycles = motorcycles;
    }
}
