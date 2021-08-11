package Lesson06;

import java.sql.SQLOutput;

public class Homework06 {
    public static void main(String[] args) {
        String WinEvent = " получилось";
        String LossEvent = " не получилось";
        String eventName;
        String eventResult;


        Cat cat1 = new Cat("Васька", 200, 1);
        Cat cat2 = new Cat("Барсик", 150, 2);
        Dog dog1 = new Dog("Макс", 500, 10);
        Dog dog2 = new Dog("Рэкс", 400, 8);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        int runLength = 200;
        int swimLength = 8;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";

            eventName = "пробежать " + animals[i].getMaxRun() + "м. Пытается пробежать ";
            eventResult = animals[i].run(runLength) ? WinEvent : LossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "проплыть " + animals[i].getMaxSwim() + " м. Пытается проплыть ";
            eventResult = (swimResult == Animal.SWIM_OK) ? WinEvent : LossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. коты не плавают";
            result(nameString, eventName, swimLength, eventResult);
        }
        System.out.println("============");
        System.out.println("Всего животных = " + Animal.countAnimal + ", котов= " + Cat.countCat + " и собак= " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, int eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + "м. и у него" + resultEvent);

    }


}
