/* ques -5) You need to design a school management system to illustrate runtime polymorphism in Java.
 Create a superclass called Person with an abstract method named performDuty(). Next, define two subclasses: 
 Student and Teacher. Each subclass overrides performDuty() in a distinct way, such as printing messages related to studying or teaching.
In your main class, create an array or list of Person references, then fill it with instances of both Student and Teacher. 
Finally, iterate through the array and call the performDuty() method on each element to show that the correct subclass 
implementation is invoked at runtime, even though all references are of the type Person.


 */
// Abstract superclass
abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void performDuty();
}

// Student subclass
class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is studying for exams.");
    }
}

// Teacher subclass
class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is teaching Java to students.");
    }
}

// Main class
public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create an array of Person references
        Person[] people = new Person[4];

        // Populate with Student and Teacher objects
        people[0] = new Student("Aman");
        people[1] = new Teacher("Mrs. Sharma");
        people[2] = new Student("Varchasv");
        people[3] = new Teacher("Mr. Kumar");

        // Iterate and call performDuty() - demonstrates runtime polymorphism
        for (Person person : people) {
            person.performDuty();
        }
    }
}
