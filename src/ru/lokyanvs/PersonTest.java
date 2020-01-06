package ru.lokyanvs;

public class PersonTest {
    public static void main(String[] args) {
        Person sasha = new Person(true, "Саша");
        Person masha = new Person(false, "Маша");
        Person pasha = new Person(true, "Паша");
        Person lena = new Person(false, "Лена");
        Person vitya = new Person(true, "Витя");
        Person sveta = new Person(false, "Света");

        sasha.marry(masha);
        pasha.marry(lena);
        vitya.marry(sveta);

        vitya.marry(masha);
        sveta.marry(pasha);

        pasha.marry(sasha);

        System.out.println(sasha);
        System.out.println(masha);
        System.out.println(pasha);
        System.out.println(lena);
        System.out.println(vitya);
        System.out.println(sveta);
    }
}
