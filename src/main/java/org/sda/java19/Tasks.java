package org.sda.java19;

import org.sda.java19.models.Group;
import org.sda.java19.models.Person;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author bahadir tasli
 */

public class Tasks {
    public void sortByLastName(List<Group>groupList){
        for (Group group : groupList) {
            group.setStudents(group.getStudents().stream()
                    .sorted(Comparator.comparing(Person::getLastName))
                    .collect(Collectors.toList()));
        }
    }

    public void displayGroupWithMaxStudents(List<Group> groupList) {
       // groupList.stream()
               // .sorted(Comparator.comparingInt(List :: size).reversed())
                //.findFirst()
                //.ifPresent(System.out :: println);
    }
    public void displayUnder25Students(List<Group> groupList) {
        groupList.forEach(group -> {
            group.getStudents().forEach(student -> {
                if (getAge(student.getDateOfBirth().getYear()) < 25) {
                    System.out.println(student);
                }});
        });
    }

    private int getAge(int yearOfBirth){
        return LocalDate.now().getYear() - yearOfBirth;
    }
}
