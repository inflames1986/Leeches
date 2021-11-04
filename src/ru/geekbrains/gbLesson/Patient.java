package ru.geekbrains.gbLesson;

import javax.naming.Name;

public class Patient implements Sicking {

    String name;
    int age;
    String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                '}';
    }

    @Override
    public void sick() {

        System.out.println(name + " возраст: " + age + " болезнь: " + disease);
    }

}
