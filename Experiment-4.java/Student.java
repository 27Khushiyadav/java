/* QUESTION 1 :- Create a Student class with attributes for name and age. Implement a default constructor to assign default values 
and a parameterized constructor to initialize the attributes with user
defined values. Create objects using both constructors and display their details.*/
public class Student {
    String name;
    int age;
 
    Student() {
       this.name = "harry";
       this.age = 20;
       System.out.println("default constructor");
    }
 
    Student(String var1, int var2) {
       this.name = var1;
       this.age = var2;
       System.out.println("parameterised constructor");
    }
 
    void display() {
       System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
 
    public static void main(String[] var0) {
       Student var1 = new Student();
       var1.display();
       Student var2 = new Student("Alice", 20);
       var2.display();
    }
 }

