import java.util.Date;

// Enum for Student Status
enum Status {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR;
}

// MyDate class
class MyDate {
    int year, month, day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

// Person class
class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

// Student class
class Student extends Person {
    private Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

// Employee class
class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}

// Faculty class
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + super.toString();
    }
}

// Staff class
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString();
    }
}

// FullTime class
class FullTime extends Staff {
    public FullTime(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired, title);
    }

    @Override
    public String toString() {
        return "FullTime: " + super.toString();
    }
}

// PartTime class
class PartTime extends Staff {
    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, String address, String phoneNumber, String emailAddress, String office, MyDate dateHired, String title, double hourlyRate, int hoursWorked) {
        super(name, address, phoneNumber, emailAddress, office, hourlyRate * hoursWorked, dateHired, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTime: " + super.toString();
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Test program
public class TestProgram {
    public static void main(String[] args) {
        MyDate dateHired = new MyDate(2020, 1, 1);

        Person person = new Person("John Doe", "123 Main St", "555-5555", "john@example.com");
        Student student = new Student("Jane Doe", "123 Main St", "555-5555", "jane@example.com", Status.FRESHMAN);
        Employee employee = new Employee("Bob Smith", "123 Main St", "555-5555", "bob@example.com", "Office 1", 50000, dateHired);
        Faculty faculty = new Faculty("Alice Johnson", "123 Main St", "555-5555", "alice@example.com", "Office 2", 60000, dateHired, "9-5", "Professor");
        Staff staff = new Staff("Tom Brown", "123 Main St", "555-5555", "tom@example.com", "Office 3", 40000, dateHired, "Manager");
        FullTime fullTime = new FullTime("Sally Green", "123 Main St", "555-5555", "sally@example.com", "Office 4", 50000, dateHired, "Director");
        PartTime partTime = new PartTime("Jerry White", "123 Main St", "555-5555", "jerry@example.com", "Office 5", dateHired, "Clerk", 20, 20);

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
        System.out.println(fullTime);
        System.out.println(partTime);
        System.out.println("Part-time employee earnings: " + partTime.calculateSalary());
    }
}
