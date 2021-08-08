package Lesson05;

public class Person { /** 1 задание */
    private String surName;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    /** 2 задание */
    public Person(String surName, String name, String patronymic, String position, String email, String phone,
                  int salary,
                  int age) {
        this.age = age;
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    /** 3 задание */
    int getAge() {
        return age;
    }
    int getSalary() {
        return salary;
    }
    String getPatronymic() {
        return patronymic;
    }
    String getName() {
        return name;
    }
    String getSurname() {
        return surName;
    }
    String getPosition() {
        return position;
    }
    String getPhone() {
        return phone;
    }
    String getEmail() {
        return email;
    }

    String getFullInfo() {
        return this.surName + " " +
                this.name + " " +
                this.patronymic + " " +
                this.position + ", " +
                this.email + ", " +
                this.phone + ", " +
                this.salary + ", Возраст: " +
                this.age;
    }

}
