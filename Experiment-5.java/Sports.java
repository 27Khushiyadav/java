/* Question 2 :- Create a Java program with a Player class and derive three subclasses: Cricket_Player, 
Football_Player, and Hockey_Player. Implement attributes such as name, age, and 
position, and methods like play() and train() to represent these players.*/

    // Superclass
class Player {
    protected String name;
    protected int age;
    protected String position;

    // Constructor
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // Common methods
    public void play() {
        System.out.println(name + " is playing.");
    }

    public void train() {
        System.out.println(name + " is training.");
    }
}

// Subclass for Cricket Players
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    // Overriding play method
    @Override
    public void play() {
        System.out.println(name + " is playing cricket as a " + position + ".");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing batting and bowling.");
    }
}

// Subclass for Football Players
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    // Overriding play method
    @Override
    public void play() {
        System.out.println(name + " is playing football as a " + position + ".");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing dribbling and shooting.");
    }
}

// Subclass for Hockey Players
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    // Overriding play method
    @Override
    public void play() {
        System.out.println(name + " is playing hockey as a " + position + ".");
    }

    @Override
    public void train() {
        System.out.println(name + " is practicing stick handling and passing.");
    }
}

// Main class to test the program
public class Sports {
    public static void main(String[] args) {
        // Creating objects of different players
        Cricket_Player cricketPlayer = new Cricket_Player("Virat Kohli", 35, "Batsman");
        Football_Player footballPlayer = new Football_Player("Cristiano Ronaldo", 39, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Sandeep Singh", 38, "Defender");

        // Calling methods
        cricketPlayer.play();
        cricketPlayer.train();
        System.out.println();

        footballPlayer.play();
        footballPlayer.train();
        System.out.println();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}


