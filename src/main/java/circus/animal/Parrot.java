package circus.animal;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    @Override
    public int getValue() {
<<<<<<< HEAD:src/main/java/circus/animal/Parrot.java
        return 10;
=======
        return 20;
>>>>>>> improved:src/main/java/Parrot.java
    }
}
