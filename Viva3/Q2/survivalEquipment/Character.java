package com.report.survivalEquipment;

import com.report.animatronicMonsters.*;
import com.report.survivalEquipment.CloseDoor;
import com.report.survivalEquipment.Equipment;
import com.report.survivalEquipment.Flashlight;

public class Character extends Equipment {

    private static Equipment[] equipment;

    //这个方法应该被重写以接受一个Flashlight和一个CloseDoor对象，将它们添加到角色的装备列表中，并返回该列表。
    @Override
    public Equipment[] createEquipment(Flashlight f, CloseDoor c) {
        equipment = new Equipment[]{f, c};
        return equipment;
    }

    //这个方法应该被重写为
    //显示角色的装备列表以及他们的剩余Flashlight和CloseDoor
    @Override
    public void equipmentList() {
        System.out.println("Equipment List:");
        if (equipment == null) {
            System.out.println("No equipment");
        } else {
            Equipment equipment1 = equipment[0]; // Flashlight
            if (equipment1 != null && equipment1 instanceof Flashlight) {//equipment1!=null && 判断equipment1对象是否是Flashlight对象
                Flashlight flashlight = (Flashlight) equipment1;
                //打印剩余Flashlight
                System.out.println(flashlight.getName() + "：" + equipment1.getBattery());
            }
            Equipment equipment2 = equipment[1]; // CloseDoor
            if (equipment2 != null && equipment2 instanceof CloseDoor) { //equipment2!= null && 判断equipment2是否为CloseDoor对象
                CloseDoor closeDoor = (CloseDoor) equipment2;
                //打印剩余CloseDoor
                System.out.println(closeDoor.getName() + "：" + equipment2.getDoorUses() + "\n");
            }
        }

    }


    //可以被实现来允许角色使用装备对抗怪物。它应该接受的equipmentName和monster，
    // 减少设备的资源(例如，电池寿命或使用)，并返回设备是否被成功使用
    //假设两个设备Flashlight和CloseDoor设备名称以，','分割；例如： Flashlight Battery,CloseDoor
    public boolean useEquipment(String equipmentName, Monster monster) {
        //equipmentName.trim():去除字符串的前后空格
        equipmentName = equipmentName.trim();
        //分割equipmentName名字
        String[] split = equipmentName.split(",");
        //分割出来的Flashlight设备名字
        String f = "";
        //分割出来的CloseDoor设备名字
        String c = "";
        if (split.length == 1) {
            f = split[0];
            c = split[0];
        } else if (split.length == 2) {
            f = split[0];
            c = split[1];
        }
        //获取Flashlight设备名称
        String flashlightName = new Flashlight().getName();
        //获取CloseDoor设备名称
        String closeDoorName = new CloseDoor().getName();
        if (!f.equals(flashlightName) && !c.equals(closeDoorName)) {
            System.out.println("Please pass in the correct equipment name");
            return false;
        }
        //获取剩余Flashlight，CloseDoor设备
        Equipment flashlight = equipment[0];
        //获取剩余Flashlight数量
        int battery = flashlight.getBattery();
        //获取剩余closeDoor数量
        Equipment closeDoor = equipment[1];
        int doorUses = closeDoor.getDoorUses();
        //获取怪物减少的电池（Flashlight）数量
        int batteryReduction = monster.getBatteryReduction();
        //判断monster类型，根据不同类型进行不同操作
        if (monster instanceof Bonnie) {
            //如果剩余flashlight少于Bonnie减少的Bonnie，返回false
            if (battery < batteryReduction) {
                System.out.println("Flashlight Battery The remaining amount does not repel monsters");
                return false;
            } else {
                equipment[0] = new Flashlight(battery - batteryReduction);
                //打印剩余设备
                equipmentList();
                return true;
            }
        } else if (monster instanceof Chica) {
            if (battery >= batteryReduction && doorUses >= 1) {
                equipment[0] = new Flashlight(battery - batteryReduction);
                equipment[1] = new CloseDoor(--doorUses);
                //打印剩余设备
                equipmentList();
                return true;
            } else {
                System.out.println("Flashlight Battery and CloseDoor The remaining amount does not repel monsters");
                return false;
            }

        } else if (monster instanceof Fazbear) {
            if (battery >= batteryReduction) {
                equipment[0] = new Flashlight(battery - batteryReduction);
                //打印剩余设备
                equipmentList();
                return true;
            } else if (doorUses >= 1) {
                equipment[1] = new CloseDoor(--doorUses);
                //打印剩余设备
                equipmentList();
                return true;
            } else {
                System.out.println("Flashlight Battery or CloseDoor The remaining amount does not repel monsters");
                return false;
            }
        } else if (monster instanceof Foxy) {
            if (doorUses <= 0) {
                System.out.println("CloseDoor The remaining amount does not repel monsters");
                return false;
            } else {
                equipment[1] = new CloseDoor(--doorUses);
                //打印剩余设备
                equipmentList();
                return true;
            }

        }
        return false;
    }
}
