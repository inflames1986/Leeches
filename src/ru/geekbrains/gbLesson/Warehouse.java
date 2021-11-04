package ru.geekbrains.gbLesson;

public class Warehouse {

    String warehouseName; // название склада
    int warehouseSize; // размер склада
    int currentCount; // текущее количество на складе

    public Warehouse(String warehouseName, int warehouseSize, int currentCount) { // конструктор
        this.warehouseName = warehouseName;
        this.warehouseSize = warehouseSize;
        this.currentCount = currentCount;
    }


    {   // блок инициализации - дефаулт
        warehouseName = "Склад 1";
        warehouseSize = 1000;
        currentCount = 0;
    }

    public Warehouse() {

    }

    public void incLeeches (int lNumber) { // увеличение количества

        if ((currentCount + lNumber) <= warehouseSize) { // если текущее количество не более мест на складе
            currentCount = currentCount + lNumber; //увеличиваем количество
        } else {
            System.out.println("Не могу добавить + " + lNumber +  " пиявок - склад переполнен");
        }
    }

    public void decLeeches (int lNumber) { // уменьшение количества

        if (currentCount >= 0 & currentCount >= lNumber) { //если текущее количество не менее нуля и текущее количество не менее изымаемого
            currentCount = currentCount - lNumber;
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseName='" + warehouseName + '\'' +
                ", warehouseSize=" + warehouseSize +
                ", currentCount=" + currentCount +
                '}';
    }
}
