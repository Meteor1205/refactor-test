package demo1;

import java.util.Objects;

public class Course {
    private String name;
    private boolean isAdvanced;

    public Course(String name, boolean isAdvanced) {
        this.name = name;
        this.isAdvanced = isAdvanced;
    }

    public String getName() {
        return name;
    }

    public boolean isAdvanced() {
        return isAdvanced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return isAdvanced == course.isAdvanced && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isAdvanced);
    }
}

