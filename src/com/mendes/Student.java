package com.mendes;

/**
 * Created by mendesmustafa on 22.11.2020.
 */

public class Student {

    private static final String DEFAULT_STR = "bilinmiyor";
    private static final int ID_LENGTH = 5;
    private static final int NAME_SURNAME_LENGTH = 2;
    private static int DEFAULT_ID = 10000;

    private int studentNo;
    private String firstName;
    private String lastName;

    public Student() {
        this(DEFAULT_ID++, DEFAULT_STR, DEFAULT_STR);
    }

    public Student(int studentNo, String firstName, String lastName) {
        setStudentNo(studentNo);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        if (studentNo < 0) {
            System.out.println("Öğrenci no sıfırdan küçük olamaz");
            if (this.studentNo == 0) {
                this.studentNo = DEFAULT_ID++;
            }
        } else {
            String strStudentNo = String.valueOf(studentNo);
            if (strStudentNo.length() != ID_LENGTH) {
                System.out.println("öğrenci no " + ID_LENGTH + " haneli olmalıdır");
                if (this.studentNo == 0) {
                    this.studentNo = DEFAULT_ID++;
                }
            } else {
                this.studentNo = studentNo;
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() <= NAME_SURNAME_LENGTH) {
            System.out.println("İsim karakter sayısı " + NAME_SURNAME_LENGTH + "'den küçük olamaz");
            if (this.firstName == null) {
                this.firstName = DEFAULT_STR;
            }
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() <= NAME_SURNAME_LENGTH) {
            System.out.println("Soyisim karakter sayısı " + NAME_SURNAME_LENGTH + "'den küçük olamaz");
            if (this.lastName == null) {
                this.lastName = DEFAULT_STR;
            }
        } else {
            this.lastName = lastName;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
