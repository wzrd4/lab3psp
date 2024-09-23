package org.example.studying;

public class SchoolKid extends Learner{

    private byte form;
    private char letter;

    public SchoolKid() {
        this("NN", 'd', (byte)81, (byte)8, 'В');
    }

    public SchoolKid(String fullName, byte form) {
        this(fullName, 'n', (byte)81, (byte)11, 'A');
    }

    public SchoolKid(String fullName, char sex, byte age, byte form, char letter) {
        super(fullName, sex, age);
        this.form = (form > 11 ? 11 : (form < 1 ? 1 : form));
        this.letter = (letter < 'А' ? 'А' : (letter > 'Я' ? 'Я' : letter));
    }

    public byte getForm() {
        return form;
    }

    public void setForm(byte form) {
        this.form = form;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String intitution() {
        return "Учебное заведение - щкола.";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.intitution() + " Класс - " + form
                + "\"" + letter + "\"";
    }
}
