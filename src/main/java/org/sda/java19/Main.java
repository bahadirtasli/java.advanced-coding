package org.sda.java19;

import org.sda.java19.model.JavaDeveloper;
import org.sda.java19.model.Person;

/**
 * Exercise-1
 *
 * Create 3 classes: Person, Developer, JavaDeveloper.
 * a. Person is a parent class, Developer inherits from Person, JavaDeveloper inherits from
 * Developer
 * b. Create constructor for every class that will call constructor of the super class. Each
 * constructor should display an information, that it has been called.
 * c. Create an object of type JavaDeveloper. What information will be displayed and in
 * what order?
 * d. Using an object of type JavaDeveloper call a method that is defined in Developer
 * class. What access modifier should it have?
 * e. *Overload method from the Person class in JavaDeveloper class to accept additional
 * parameters. -- Same method name and different parameters.
 *
 * @author bahadir tasli
 */

public class Main {

    public static void main(String[] args) {

        JavaDeveloper Jimmy = new JavaDeveloper("Jimmy","Developer","JAVA","Advanced",true,"10",false);

        System.out.println(Jimmy);

        System.out.println(Jimmy.getExperience());

    }

}