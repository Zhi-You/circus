package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);
        System.out.println("HERE A DUCK BECAME A BIRD AND IT CAN NOW FLY - upcast can have parents stuff");
        b.fly();
        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);
        train(new Duck());
        train(new Parrot());


        //Parrot p = new Parrot();
        //getToSpeak(p);

        //circus.animal.Animal a2 = new circus.animal.Animal();
        //circus.animal.Bird b2 = new circus.animal.Bird();

        // train(new circus.animal.Parrot());
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    // only available for duck objects
    private static void train(Bird bird) {
        getToSpeak(bird);
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
