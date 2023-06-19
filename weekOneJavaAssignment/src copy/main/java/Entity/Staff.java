package Entity;

public class Staff extends Person {
    private static String email;
    private static String lastName;
    private static String firstName;
    protected String staff;

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        Staff.email = email;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        Staff.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        Staff.firstName = firstName;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String staffId;
    private int id;
    private String name;
    private int age;
    private String designation;

    public Staff(String name, int age, String designation, String staffId) {
        super(firstName, lastName, email);
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.staffId = staffId;
    }

    public Staff(String name, int age, String designation) {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
