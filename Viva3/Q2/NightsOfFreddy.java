package com.report;


import com.report.animatronicMonsters.*;
import com.report.survivalEquipment.Character;
import com.report.survivalEquipment.CloseDoor;
import com.report.survivalEquipment.Equipment;
import com.report.survivalEquipment.Flashlight;

public class NightsOfFreddy {


    public static void main(String[] args) {
        //给定代码
        Flashlight fl = new Flashlight();
        CloseDoor cd = new CloseDoor();
        Character character = new Character();
        Equipment[] eqList = character.createEquipment(fl, cd);
        character.equipmentList();
        FreddyHouse freddyHouse = new FreddyHouse(8);
        Monster[] monsList = freddyHouse.createMonsters();
        freddyHouse.printMonsterAndAbilities();
        surviveTheNight(monsList, eqList, 1);
    }


    // implement your code here
    //自己写的
    public static void surviveTheNight(Monster[] monsters, Equipment[] equipment, int rounds) {
        Equipment flashlight;
        Equipment closeDoor;
        try {
            flashlight = equipment[0];
            closeDoor = equipment[1];
        } catch (NullPointerException nullPointerExceptionn) {
            System.out.println("The equipment cannot be empty");
            return;
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("The equipment cannot be 0");
            return;
        }
        //获取剩余flashlight
        int battery = flashlight.getBattery();
        //获取剩余closeDoor
        int doorUses = closeDoor.getDoorUses();
        Monster monster;
        //循环怪物
        boolean flag = true;
        for (int i = 0; i < monsters.length; i++) {
            if (flag) {
                System.out.println("round " + rounds + "：" + (i + 1));
                //获取怪物减少手电筒电池电量的数量
                monster = monsters[i];
                int batteryReduction = monster.getBatteryReduction();
                //判断怪物类型，根据不同类型进行不同操作
                if (monster instanceof Bonnie) {
                    if (battery >= batteryReduction) {
                        battery = battery - batteryReduction;
                        equipment[0] = new Flashlight(battery);
                        //显示设备列表
                        flashlight.equipmentList(equipment);
                    } else {
                        flag = false;
                        System.out.println("You didn't survive the night!!");
                        break;
                    }

                } else if (monster instanceof Chica) {
                    if (battery >= batteryReduction && doorUses >= 1) {
                        battery = battery - batteryReduction;
                        equipment[0] = new Flashlight(battery);
                        equipment[1] = new CloseDoor(--doorUses);
                        //显示设备列表
                        flashlight.equipmentList(equipment);
                    } else {
                        flag = false;
                        System.out.println("You didn't survive the night!!");
                        break;
                    }

                } else if (monster instanceof Fazbear) {
                    if (battery >= batteryReduction) {
                        battery = battery - batteryReduction;
                        equipment[0] = new Flashlight(battery);
                        //显示设备列表
                        flashlight.equipmentList(equipment);
                    } else if (doorUses >= 1) {
                        equipment[1] = new CloseDoor(--doorUses);
                        //显示设备列表
                        flashlight.equipmentList(equipment);
                    } else {
                        flag = false;
                        System.out.println("You didn't survive the night!!");
                        break;
                    }

                } else if (monster instanceof Foxy) {
                    if (doorUses >= 1) {
                        equipment[1] = new CloseDoor(--doorUses);
                        //显示设备列表
                        flashlight.equipmentList(equipment);
                    } else {
                        flag = false;
                        System.out.println("You didn't survive the night!!");
                        break;
                    }
                }
            }


        }
        if (flag) {
            System.out.println("Congrats !! You survive the night !!");
        }

    }
}
