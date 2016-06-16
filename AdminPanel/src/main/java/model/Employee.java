package model;

/**
 * Created by Yaroslav on 07.06.2016.
 */
public class Employee {

    private String fullname;
    private int age;
    private int experiance;
//    private Position position;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
}
