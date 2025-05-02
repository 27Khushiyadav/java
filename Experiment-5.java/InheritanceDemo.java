 /* QUESTION 1:- Write a java program demonstrating that a private number of a superclass can't
be accessed directly from a derived class.*/
    // Superclass
class Parent {
    private int privateData = 100;  // Private member

    // Public method to access privateData
    public int getPrivateData() {
        return privateData;
    }
}

// Subclass
class Child extends Parent {
    public void display() {
        // Attempt to access privateData directly (will cause an error)
        // System.out.println("Private Data: " + privateData)
        // Correct way: Access through a public method
        System.out.println("Accessing private data through method: " + getPrivateData());
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

    

