package bai2;

import bai1.Work;

import java.util.ArrayList;
import java.util.Arrays;

public class Factory {
    private String code;
    private String name;
    private String foremean;
    private int numberWorkers;

    public static ArrayList<Factory> factoryList = new ArrayList<>(Arrays.asList(new Factory[] {
            new Factory("X001", "Xưởng gia công", "Anh Hùng", 10),
            new Factory("X002", "Xưởng chế tác", "Anh Dương", 5),
            new Factory("X003", "Xưởng nâng cấp và bảo trì", "Chị Hằng", 12),
            new Factory("X004", "Xưởng chăm sóc khách hàng", "Chị Quỳnh", 3),
            new Factory("X005", "Xưởng dịch vụ", "Bác Sơn", 7)
    }));

    public Factory(String code, String name, String foremean, int numberWorkers) {
        this.code = code;
        this.name = name;
        this.foremean = foremean;
        this.numberWorkers = numberWorkers;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForemean() {
        return foremean;
    }

    public void setForemean(String foremean) {
        this.foremean = foremean;
    }

    public int getNumberWorkers() {
        return numberWorkers;
    }

    public void setNumberWorkers(int numberWorkers) {
        this.numberWorkers = numberWorkers;
    }
}
