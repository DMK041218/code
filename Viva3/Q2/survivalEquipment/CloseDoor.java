package com.report.survivalEquipment;

public class CloseDoor extends Equipment {
    private int count;
    private String name = "CloseDoor";

    //返回对象名称
    public String getName() {
        return this.name;
    }

    //显示有多少个CloseDoor
    @Override
    public int getDoorUses() {
        return count;
    }

    //默认10个CloseDoor设备
    public CloseDoor() {
        this.count = 10;
    }

    //根据count创建对象，假设count为9，就有9个CloseDoor设备
    public CloseDoor(int count) {
        this.count = count;
    }
}
