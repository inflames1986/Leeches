package ru.geekbrains.gbLesson;

public class Disease { // болезнь

    int codeDisease; //код болезни
    String nameDisease; //название болезни
    String description; //описание болезни
    double temperature; //температура

    public Disease(int codeDisease, String nameDisease, String description, double temperature) { //конструктор
        this.codeDisease = codeDisease;
        this.nameDisease = nameDisease;
        this.description = description;
        this.temperature = temperature;
    }

    public int getCodeDisease() {
        return codeDisease;
    }

    public void setCodeDisease(int codeDisease) {
        this.codeDisease = codeDisease;
    }

    public String getNameDisease() {
        return nameDisease;
    }

    public void setNameDisease(String nameDisease) {
        this.nameDisease = nameDisease;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
