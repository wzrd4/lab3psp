package org.example.studying;

public class Student extends Learner{
    private String faculty;
    private String specialty;
    private String group;

    public Student() {
        this("NN", 'd', (byte)81, "NF", "NS", "NG");
    }

    public Student(String fullName, String faculty, String specialty) {
        this(fullName, 'n', (byte)81, faculty, specialty, "NG");
    }

    public Student(String fullName, char sex, byte age, String faculty, String specialty, String group) {
        super(fullName, sex, age);
        this.faculty = faculty;
        this.specialty = specialty;
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    @Override
    public String intitution() {
        return "Учебное заведение - институтка.";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.intitution() + " Факультет - " + faculty
                + ", специальность - " + specialty + ", группа - " + group;
    }
}
