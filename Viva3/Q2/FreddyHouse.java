package com.report;

import com.report.animatronicMonsters.*;

import java.util.Random;

public class FreddyHouse {
    //有几个怪物
    private int monsterCount;

    private Monster[] monsters;

    private Random r = new Random();


    //构造方法传入几个对象，创建几个怪物
    public FreddyHouse(int monsterCount) {
        this.monsterCount = monsterCount;
        this.monsters = new Monster[monsterCount];
    }

    public Monster[] createMonsters() {
        //使用随机数，随机生成怪物，
        //随机生成0——3： 0代表Bonnie， 1代表Chica，2代表Fazbear，3代表Foxy
        for (int i = 0; i < monsterCount; i++) {
            int num = r.nextInt(4);
            if (num == 0) {
                monsters[i] = new Bonnie();
            } else if (num == 1) {
                monsters[i] = new Chica();
            } else if (num == 2) {
                monsters[i] = new Fazbear();
            } else if (num == 3) {
                monsters[i] = new Foxy();
            }
        }
        return this.monsters;
    }

    //这个方法将显示怪物的名字和他们独特的能力
    public void printMonsterAndAbilities() {
        //打印Monster信息
        System.out.println("Monster：");
        //打印Bonnie独特的能力
        new Bonnie().useUniqueAbility();
        //打印Fazbear独特的能力
        new Fazbear().useUniqueAbility();
        //打印Chica独特的能力
        new Chica().useUniqueAbility();
        //打印Foxy独特的能力
        new Foxy().useUniqueAbility();
        //循环打印monsters里面的怪物名字
        for (Monster m : this.monsters) {
            System.out.println("Monster：" + m.toString());
        }
        System.out.println("");
    }
}
