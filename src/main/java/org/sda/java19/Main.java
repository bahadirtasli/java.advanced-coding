package org.sda.java19;

import org.sda.java19.exceptions.MaximumNumberOfStudentsReachedException;
import org.sda.java19.models.Group;
import org.sda.java19.models.Person;
import org.sda.java19.models.Student;
import org.sda.java19.models.Trainer;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * SDA Scheduler
 *
 * Create a class hierarchy:
 * Person.java - firstname
 *             - lastname
 *             - dateOfBirth
 * Trainer.java (extends Person) - isAuthorized (boolean)
 * Student.java (extends Person) - hasPreviousJavaKnowledge (boolean)
 *
 *
 * Create a Group class which has
 *
 * name (Java19Remote, Java20Remote, etc)
 * one trainer
 * a list of students
 *
 *
 *
 * Manually initialize 15 students; 4 groups and 3 trainers;
 * Store all students in a list; all groups in a list; all trainers in a list;
 * Assign a trainer to each group
 * Assign 2-3 students to each group
 * Ensure the fact that a group will only have distinct students (How would you do that?)
 * Ensure the fact that a group will only have a maximum of 5 students; When you try to add a 6th one throw an MaximumNumberOfStudentsReached exception
 * Display all students in a group sorted alphabetically by lastName
 * Display the group with the maximum number of students
 * Display all students younger than 25, from all groups
 * Display all students grouped by trainer that teaches to them (eg. Trainer1 - stud1, stud3, stud4; Trainer2 - stud2, stud 10) - regardless of the group they're part of (If you were to store this information in a data structure what would you use?)
 * Display all students with previous java knowledge
 * Display the group with the highest number of students with no previous java knowledge
 * Remove all the students younger than 20 from all groups. Display the groups before and after removal.
 *
 * @author bahadir tasli
 */
public class Main {

    private static final int MAXIMUM_ALLOWED_STUDENTS = 5;

    public static void main(String[] args) throws MaximumNumberOfStudentsReachedException {
        List<Student> studentList = getInitialStudents();
        List<Trainer> trainerList = getInitialTrainers();
        List<Group> groupList = getInitialGroups();

        assignStudentsToGroup(groupList, studentList);
        assignTrainerToGroup(groupList, trainerList);

        Tasks tasks = new Tasks();
        tasks.sortByLastName(groupList);
        tasks.displayGroupWithMaxStudents(groupList);
        tasks.sortByLastName(groupList);

        // Display all students in a group sorted alphabetically by lastName



        // Display the group with the maximum number of students




    }

    private static List<Student> getInitialStudents() {
        Student student = new Student();
        student.setFirstName("Vinod");
        student.setLastName("John");
        student.setDateOfBirth(LocalDate.of(2000, 12, 18));
        student.setHasPreviousJavaKnowledge(true);

        Student student1 = new Student();
        student1.setFirstName("Ceyda");
        student1.setLastName("Tasli");
        student1.setDateOfBirth(LocalDate.of(1993, 5, 26));
        student1.setHasPreviousJavaKnowledge(false);

        Student student2 = new Student();
        student2.setFirstName("Bahadir");
        student2.setLastName("Tasli");
        student2.setDateOfBirth(LocalDate.of(1993, 6, 12));
        student2.setHasPreviousJavaKnowledge(true);

        Student student3 = new Student();
        student3.setFirstName("Orcun");
        student3.setLastName("Tasli");
        student3.setDateOfBirth(LocalDate.of(1993, 6, 12));
        student3.setHasPreviousJavaKnowledge(false);

        Student student4 = new Student();
        student4.setFirstName("Suleyman");
        student4.setLastName("Yesilbulut");
        student4.setDateOfBirth(LocalDate.of(1988, 1, 2));
        student4.setHasPreviousJavaKnowledge(true);

        Student student5 = new Student();
        student5.setFirstName("Mert");
        student5.setLastName("Sahindogan");
        student5.setDateOfBirth(LocalDate.of(1992, 1, 2));
        student5.setHasPreviousJavaKnowledge(true);

        Student student6 = new Student();
        student6.setFirstName("Ali");
        student6.setLastName("Veli");
        student6.setDateOfBirth(LocalDate.of(1981, 1, 2));
        student6.setHasPreviousJavaKnowledge(false);

        Student student7 = new Student();
        student7.setFirstName("ABC");
        student7.setLastName("ABC1");
        student7.setDateOfBirth(LocalDate.of(1981, 1, 3));
        student7.setHasPreviousJavaKnowledge(false);

        Student student8 = new Student();
        student8.setFirstName("ABC");
        student8.setLastName("ABC2");
        student8.setDateOfBirth(LocalDate.of(1981, 1, 3));
        student8.setHasPreviousJavaKnowledge(false);

        Student student9 = new Student();
        student9.setFirstName("ABC");
        student9.setLastName("ABC3");
        student9.setDateOfBirth(LocalDate.of(1981, 1, 3));
        student9.setHasPreviousJavaKnowledge(false);


        //To create 14 other students with different data, make sure there is no duplicates

        return List.of(student);
    }

    private static List<Trainer> getInitialTrainers() {
        Trainer trainer = new Trainer();
        trainer.setLastName("Tony");
        trainer.setFirstName("Stark");
        trainer.setDateOfBirth(LocalDate.of(1938, 2, 12));
        trainer.setAuthorized(true);

        Trainer trainer1 = new Trainer();
        trainer1.setLastName("Tony1");
        trainer1.setFirstName("Stark1");
        trainer1.setDateOfBirth(LocalDate.of(1938, 3, 12));
        trainer1.setAuthorized(true);

        Trainer trainer2 = new Trainer();
        trainer2.setLastName("Tony2");
        trainer2.setFirstName("Stark2");
        trainer2.setDateOfBirth(LocalDate.of(1938, 4, 12));
        trainer2.setAuthorized(true);

        // TO DO: create 2 other trainers with different data, make sure there is no duplicates
        return List.of(trainer);
    }

    private static List<Group> getInitialGroups() {
        Group group = new Group();
        group.setName("Java19");


        Group group2 = new Group();
        group2.setName("Java14");


        Group group3 = new Group();
        group3.setName("Java15");


        Group group4 = new Group();
        group4.setName("Java10");


        return List.of(group, group2, group3, group4);
    }

    private static void assignStudentsToGroup(List<Group> groupList, List<Student> studentList) throws MaximumNumberOfStudentsReachedException {

        LinkedList<Student> studentLinkedList = new LinkedList<>(studentList); // ArrayList to LinkedList conversion

        for (Group group: groupList) {
            List<Student> students = new ArrayList<>();

            for (int i = 0; i <= 4; i++){
                if (students.size() >= MAXIMUM_ALLOWED_STUDENTS) {
                    throw new MaximumNumberOfStudentsReachedException(group.getName());
                }

                if (studentLinkedList.isEmpty()) {
                    Random random = new Random();
                    int nextStudentIndex = random.nextInt(studentList.size()); // Get the random Index
                    students.add(studentList.get(nextStudentIndex));
                    studentList.remove(nextStudentIndex);
                }
            }

            group.setStudents(students);
        }

    }

    private static void assignTrainerToGroup(List<Group> groupList, List<Trainer> trainerList){
        for (Group group: groupList) {

            Random random = new Random();
            int nextTrainerIndex = random.nextInt(trainerList.size()); // Get the random Index
            group.setTrainer(trainerList.get(nextTrainerIndex));
            }
        }
    }