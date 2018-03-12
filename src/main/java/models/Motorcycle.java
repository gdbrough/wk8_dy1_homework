package models;

public class Motorcycle {

    private int id;
    private String make;
    private String model;
    private Person person;

    public Motorcycle() {
    }

    public Motorcycle(String make, String model, Person person) {
        this.make = make;
        this.model = model;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
