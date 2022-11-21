package org.sda.java19.model;

public class JavaDeveloper extends  Developer{

    private boolean isSenior;

    private String experience;

    public JavaDeveloper(String firstName, String lastName, String developerType, String levelOfDeveloper, boolean isSenior, String experience, boolean isBeginner) {
        super(firstName, lastName, developerType, levelOfDeveloper, isBeginner);
        this.isSenior = isSenior;
        this.experience = experience;
    }

    public boolean isSenior() {
        return isSenior;
    }

    public void setSenior(boolean senior) {
        isSenior = senior;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = String.valueOf(experience);
    }
}
