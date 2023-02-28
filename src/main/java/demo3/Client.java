package demo3;

import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(10, 10.0),
                new Person(20, 20.0),
                new Person(30, 30.0)
        );
        String result = run(people);
        System.out.println(result);
    }

    public static String run(List<Person> people) {
        return String.format("youngestAge: %s, totalSalary: %s;", youngestAge(people), totalSalary(people));
    }

    private static double totalSalary(List<Person> people) {
        return people.stream().reduce(0.0, (total, p) -> total + p.getSalary(), Double::sum);
    }

    private static int youngestAge(List<Person> people) {
        return people.stream().min((Comparator.comparingInt(Person::getAge))).orElse(new Person(-1, 0)).getAge();
    }
}
