package com.company;

import java.util.Date;

public class Person {
    private static String name;
    private static String surname;
    public Person(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public static String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }
}
