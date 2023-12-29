package com.report.survivalEquipment;

//设备类
public class Equipment {

    //这个方法将初始化一个数组来存储设备项目。它应该接受一个Flashlight和一个CloseDoor对象，将它们添加到数组中，然后返回数组
    public Equipment[] createEquipment(Flashlight f, CloseDoor c) {

        return null;
    }

    //这个方法将显示设备列表
    public void equipmentList() {

    }

    public void equipmentList(Equipment[] equipment) {
        if (equipment == null) {
            System.out.println("No equipment");
        } else {
            Equipment equipment1 = equipment[0]; // Flashlight
            if (equipment1 != null && equipment1 instanceof Flashlight) {//equipment1!=null && 判断equipment1对象是否是Flashlight对象
                //打印剩余Flashlight
                System.out.println("flashLight：" + equipment1.getBattery());
            }
            Equipment equipment2 = equipment[1]; // CloseDoor
            if (equipment2 != null && equipment2 instanceof CloseDoor) { //equipment2!= null && 判断equipment2是否为CloseDoor对象
                //打印剩余CloseDoor
                System.out.println("close door：" + equipment2.getDoorUses() + "\n");
            }
        }
    }


    //显示电池（Flashlight）剩余多少
    public int getBattery() {
        return 0;
    }

    //显示门(CloseDoor)剩余多少
    public int getDoorUses() {
        return 0;
    }
}
