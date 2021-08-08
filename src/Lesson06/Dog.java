package Lesson06;

class Dog extends Animal {
    public static int countDog = 0;

    Dog(String name, int maxRun, int maxSwim) {
        super("Пёс", name, maxRun, maxSwim);
        ++countDog;
    }
}
