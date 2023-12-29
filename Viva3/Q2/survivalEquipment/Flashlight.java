package com.report.survivalEquipment;

public class Flashlight extends Equipment {

    private int count;
    private String name = "Flashlight Battery";

    //返回对象名称
    public String getName() {
        return this.name;
    }

    //显示有多少个Flashlight
    @Override
    public int getBattery() {
        return count;
    }


    //默认100个Flashlight设备
    public Flashlight() {
        this.count = 100;
    }

    //根据count创建对象，假设count为200，就有200个Flashlight设备
    public Flashlight(int count) {
        this.count = count;
    }
}
