import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Ringo", "Starr", 2.0));
        people.add(new Student("Paul", "McCartney", 3.5));
        people.add(new Employee("John", "Lennon", "manager", 27045.78));
        people.add(new Employee("George", "Harrison", "developer", 50000.0));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(
                    person + " earns " +
                            person.getPaymentAmount() +
                            " tenge"
            );
        }
    }
}
