package org.example.studying;

public class Postgraduate extends Learner {
    private String scWork;
    private String supervisor;

    public Postgraduate() {
        this("NN", 'd', (byte)81, "NSW", "NSV");
    }

    public Postgraduate(String fullName, String scWork) {
        this(fullName, 'n', (byte)81, scWork, "NSW");
    }

    public Postgraduate(String fullName, char sex, byte age, String scWork, String supervisor) {
        super(fullName, sex, age);
        this.scWork = scWork;
        this.supervisor = supervisor;
    }

    public String getScWork() {
        return scWork;
    }

    public void setScWork(String scWork) {
        this.scWork = scWork;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String intitution() {
        return "Учебное заведение - институт:аспирантура.";
    }

    public String toString() {
        return super.toString() + " " + this.intitution() + " Научная работа - " + scWork
                + ", научный руководитель - " + supervisor;
    }
}
