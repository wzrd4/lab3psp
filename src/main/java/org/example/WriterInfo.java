package org.example;

import org.example.studying.Learner;
import org.example.studying.Postgraduate;
import org.example.studying.SchoolKid;
import org.example.studying.Student;

public class WriterInfo {
    public static void main(String[] args) {
        Learner l1 = new SchoolKid();
        System.out.println(l1);

        Learner l2 = new Student("Кравченко Владислав Павлович", 'm',
                (byte)20, "ИЭФ", "ИСиТ(вЭ)", "272302");
        System.out.println(l2);

        Learner l3 = new Postgraduate("Демидовец Владислава Валерьевна",
                "Балльно-рейтинговая система в современном высшем образовании");
        System.out.println(l3);
    }
}