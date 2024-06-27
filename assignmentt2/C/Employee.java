package assignmentt2;
public class Employee {
    // Private member variables
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for ID
    public int getID() {
        return id;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Method to get full name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to get annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise salary by a percentage
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John", "Doe", 5000);

        // Testing the Employee class
        System.out.println(emp1);
        System.out.println("Annual Salary: " + emp1.getAnnualSalary());

        emp1.raiseSalary(10);
        System.out.println("After 10% raise: " + emp1);

        emp1.setSalary(6000);
        System.out.println("After setting salary to 6000: " + emp1);
    }
}
