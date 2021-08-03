package Lesson05;

public class Homework05 {

    public static void main(String [] args) {

        Person[] person = new Person[5];
        person[0] = new Person("Иванов ", "Иван", "Иванович", "- менеджер", "a@a.ru", "+7123456789", 20000, 35);
        person[1] = new Person("Петров ", "Петр", "Петрович", "- курьер", "b@b.ru", "+7789454133", 15000, 45);
        person[2] = new Person("Сидаров ", "Николай", "Николаевич", "- секретарь", "c@c.ru", "+7746132384", 30000, 41);
        person[3] = new Person("Матвеева ", "Галина", "Петровна", "- консультант", "d@d.ru", "+7713646548", 25000, 38);
        person[4] = new Person("Красносельская ", "Ольга", "Васильевна", "- директор", "e@e.ru", "+813146547", 40000, 35);

        getAllPersonsInOffice(person);
        System.out.println(" ");
        getOldPerson(person, 40);


    }

public static void getAllPersonsInOffice(Person[] person) {
    System.out.println("Весь персонал: ");
    for (int i = 0; i < person.length; i++)
        System.out.println((i + 1) + " " + person[i].getFullInfo());


}
public static void getOldPerson(Person[] person, int year) {
    System.out.println("Сотрудники старше 40 лет: ");
        for (int i = 0; i < person.length; i++)
            if (person[i].getAge() > year ) {
                System.out.println(person[i].getFullInfo());
            }
}
}
