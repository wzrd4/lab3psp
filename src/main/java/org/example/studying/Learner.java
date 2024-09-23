package org.example.studying;

public abstract class Learner {
    private String fullName;
    private char sex;
    private byte age;

    public Learner() {
        this("NN", 'd', (byte)81);
    }

    public Learner(String fullName){
        this(fullName, 'n', (byte)81);
    }

    public Learner(String fullName, char sex, byte age) {
        this.fullName = fullName;
        this.age = age;
        this.sex = (sex == 'm' ? 'm' : 'f');
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public char getSex(){
        return this.sex;
    }

    public void setSex(char sex){
        this.sex = (sex == 'm' ? 'm' : 'f');
    }

    public byte getAge(){
        return this.age;
    }

    public void setAge(byte age){
        this.age = age;
    }

    public abstract String intitution();

    public String toString(){
        return fullName + ", пол - " + this.sex + ", возраст - " + this.age + " лет. ";
    }
}
