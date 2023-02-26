package demo1;

import java.util.ArrayList;
import java.util.Collections;
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
        return List.copyOf(courses);
    }

    public void setCourses(List<Course> courses) {
        this.courses = List.copyOf(courses);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }
}
