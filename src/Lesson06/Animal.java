package Lesson06;

public class Animal {
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private String type;
    protected String name;
    private int maxRun;
    private int maxSwim;

    public static int countAnimal = 0;

    Animal(String type, String name, int maxRun, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++countAnimal;
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

        protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(int distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_NONE;
    }

}
