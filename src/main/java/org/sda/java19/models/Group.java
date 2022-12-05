package org.sda.java19.models;

import lombok.Data;

import java.util.List;

/**
 * Group model
 *
 * @author bahadir tasli
 */
@Data
public class Group {
    private String name;
    private Trainer trainer;
    private List<Student> students;
}