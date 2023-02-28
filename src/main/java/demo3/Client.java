package demo3;

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
        int youngest = people.get(0).getAge();
        double totalSalary = 0;
        for (Person p : people) {
            if (p.getAge() < youngest) youngest = p.getAge();
        }
        for (Person p : people) {
            totalSalary += p.getSalary();
        }
        return String.format("youngestAge: %s, totalSalary: %s;", youngest, totalSalary);
    }
}
