package org.sda.java19.models;

import lombok.Data;

import java.time.LocalDate;

/**
 * Person base class
 *
 * @author bahadir tasli
 */
@Data
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}