package org.sda.java19.model;

public class Developer extends Person{

    private String developerType;

    private String levelOfDeveloper;

    private boolean isBeginner;

    public Developer (String firstName,String lastName, String developerType, String levelOfDeveloper, boolean isBeginner) {
        super(firstName, lastName);
        this.developerType = developerType;
        this.levelOfDeveloper = levelOfDeveloper;
        this.isBeginner = isBeginner;
    }

    public String getDeveloperType() {
        return developerType;
    }

    public void setDeveloperType(String developerType) {
        this.developerType = developerType;
    }

    public String getLevelOfDeveloper() {
        return levelOfDeveloper;
    }

    public void setLevelOfDeveloper(String levelOfDeveloper) {
        this.levelOfDeveloper = levelOfDeveloper;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "developerType='" + developerType + '\'' +
                ", levelOfDeveloper='" + levelOfDeveloper + '\'' +
                '}';
    }

    public boolean isBeginner() {
        return super.isWorking();
    }
}
