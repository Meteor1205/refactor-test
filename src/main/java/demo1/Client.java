package demo1;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("A");

        // bad guy!
        run(person);
    }

    public static void run(Person person) {
        for (String name : readBasicNames()) {
            person.addCourse(new Course(name, false));
        }
    }

    public static String[] readBasicNames() {
        return new String[]{"a", "b", "c", "d"};
    }
}
