public class Person {

    // Attributes (fields)
    private String firstName;
    private String lastName;
    private String gender;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString() method
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    // equals(Person p) method
    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }

        return this.firstName.equals(p.firstName) &&
               this.lastName.equals(p.lastName) &&
               this.gender.equals(p.gender);
    }
}
