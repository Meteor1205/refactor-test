package demo1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Course> courses;

    public Person(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
