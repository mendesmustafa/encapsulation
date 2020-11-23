package com.mendes;

public class Main {

    public static void main(String[] args) {

        Class class1 = new Class("Cumhuriyet Lisesi", "10-A", 4);
        System.out.println(class1);

        Student student = new Student(55555, "Mustafa", "Mendeş");
        class1.saveStudent(student);
        System.out.println("\n" + class1);

        class1.saveStudent(new Student());
        System.out.println("\n" + class1);

        class1.saveStudent(new Student(55554, "Ali", "Can"));
        System.out.println("\n" + class1);

        class1.saveStudent(new Student());
        System.out.println("\n" + class1);

        Student student1 = new Student(55553, "Murat", "Kaya");
        class1.saveStudent(student1);
        System.out.println("\n" + class1);

    }
}