package ru.geekbrains.gbLesson;

public class Leech implements Biting {

    String leechName;
    String leechType;
    int size;
    int price;

    public Leech(String leechName, String leechType, int size, int price) {
        this.leechName = leechName;
        this.leechType = leechType;
        this.size = size;
        this.price = price;
    }


    public String getLeechName() {
        return leechName;
    }

    public void setLeechName(String leechName) {
        this.leechName = leechName;
    }

    public String getLeechType() {
        return leechType;
    }

    public void setLeechType(String leechType) {
        this.leechType = leechType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Leech{" +
                "leechName='" + leechName + '\'' +
                ", leechType='" + leechType + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    @Override
    public void bite() {

        System.out.println(leechName + " кусает пациента");

    }
}

