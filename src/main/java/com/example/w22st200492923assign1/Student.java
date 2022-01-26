package com.example.w22st200492923assign1;

import static java.sql.Types.NULL;

public class Student {

    private String firstName;
    private String lastName;
    private int studentNumber;

    public Student (String f1Name, String l1Name, int stNumber){

        firstName = f1Name;
        lastName = l1Name;
        studentNumber = stNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public boolean dataValidator()
    {
        if(this.firstName.isEmpty() || this.lastName.isEmpty() || this.studentNumber == NULL  )
        {
            return false;
        }
        else {
            return true;
        }
    }

}
