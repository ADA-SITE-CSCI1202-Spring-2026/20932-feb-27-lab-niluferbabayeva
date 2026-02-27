import java.util.Arrays;

public class Teacher extends Person {

    private String department;
    private String[] courses;

    // Default constructor
    public Teacher() {
        super(); // calls Person default constructor
    }

    // Parameterized constructor
    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {

        super(firstName, lastName, gender);  // call parent constructor
        this.department = department;
        this.courses = courses;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    // toString() method
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    // equals(Teacher t) method
    public boolean equals(Teacher t) {
        if (t == null) return false;

        return super.equals(t) &&   // compare Person fields
               department.equals(t.department) &&
               Arrays.equals(courses, t.courses);
    }
}