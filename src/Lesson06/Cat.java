package Lesson06;

class Cat extends Animal {
    public static int countCat = 0;


    Cat(String name, int maxRun, int maxSwim) {
        super("Кот", name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(int distance) {
        return Animal.Swim_None;
    }

}
