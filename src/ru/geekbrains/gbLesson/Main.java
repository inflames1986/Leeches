package ru.geekbrains.gbLesson;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Leech leech1 = new Leech("Пиявка1", "Медицинская", 50, 75);
        Leech leech2 = new Leech("Пиявка2", "Кусачая", 60, 80);
        Leech leech3 = new Leech("Пиявка3", "Кусачая", 70, 85);
        Leech leech4 = new Leech("Пиявка4", "Медицинская", 80, 90);
        Leech leech5 = new Leech("Пиявка5", "Медицинская", 90, 100);

        Map<String, Leech> leeches = new TreeMap<>();

        leeches.put("Leech1", leech1);
        leeches.put("Leech2", leech2);
        leeches.put("Leech3", leech3);
        leeches.put("Leech4", leech4);
        leeches.put("Leech5", leech5);

        Patient patient1 = new Patient("Иванов", 35, "щитовидка");
        Patient patient2 = new Patient("Петров", 45, "короновирус");
        Patient patient3 = new Patient("Сидоров", 55, "урология");
        Patient patient4 = new Patient("Дураков", 30, "нервная система");
        Patient patient5 = new Patient("Идиотов", 20, "гинекология");

        Map<String, Patient> patients = new TreeMap<>();

        patients.put("Patient1", patient1);
        patients.put("Patient2", patient2);
        patients.put("Patient3", patient3);
        patients.put("Patient4", patient4);
        patients.put("Patient5", patient5);


        leeches.get ("Leech1").bite();
        patients.get("Patient2").sick();


        System.out.println(leeches);
        System.out.println(patients);

        Warehouse warehouse = new Warehouse();
        System.out.println(warehouse);

        warehouse.incLeeches(1100);
        System.out.println(warehouse);

    }
}
