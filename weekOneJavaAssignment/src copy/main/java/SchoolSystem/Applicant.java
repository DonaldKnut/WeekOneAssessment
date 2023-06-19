package SchoolSystem;

public class Applicant {
    private int applicantsId;
    private String name;
    private int age;

    public Applicant(String name, int age, int applicantsId) {
        this.name = name;
        this.age = age;
        this.applicantsId = applicantsId;
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

    public int getApplicantsId() {
        return applicantsId;
    }

    public void setApplicantsId(int applicantsId) {
        this.applicantsId = applicantsId;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
