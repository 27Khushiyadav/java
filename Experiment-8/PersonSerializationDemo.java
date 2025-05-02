/*5)	Write a class Person with fields like name and age, implementing Serializable. In your main method, 
create an instance of Person and serialize it to a file (person.txt) using ObjectOutputStream. 
Then, read it back using ObjectInputStream and confirm that the deserialized object has the same field values.*/
import java.io.*;

// Person class implementing Serializable
class Person implements Serializable {
    private String name;
    private int age;

    // Serial version UID (optional but recommended)
    private static final long serialVersionUID = 1L;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for printing
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class PersonSerializationDemo {
    public static void main(String[] args) {
        Person originalPerson = new Person("Alice", 25);

        // Serialize to file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            out.writeObject(originalPerson);
            System.out.println("Person object serialized to person.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize from file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialized Person:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
