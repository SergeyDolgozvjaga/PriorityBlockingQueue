package com.sergeydolzgozvjaga.priorityblockingqueue.Model;

import java.util.logging.Logger;

public class Person implements Comparable<Person> {

    private final Logger logger = Logger.getLogger(String.valueOf(Person.class));

    private String name;
    private int age;
    private int salary;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        logger.info("work at compareTo(Person o)");
        return this.name.compareTo(o.name);
    }
}

