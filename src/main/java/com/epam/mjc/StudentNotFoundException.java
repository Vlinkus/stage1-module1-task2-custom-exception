package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{

    public StudentNotFoundException(String msg) {
        super("Could not find student with ID "+msg);
    }
}
