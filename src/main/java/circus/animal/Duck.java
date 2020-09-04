package circus.animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a circus.animal.Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public int getValue() {
<<<<<<< HEAD:src/main/java/circus/animal/Duck.java
        return 20;
=======
        return 10;
>>>>>>> improved:src/main/java/Duck.java
    }
}
