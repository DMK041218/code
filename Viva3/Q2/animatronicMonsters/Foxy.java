package com.report.animatronicMonsters;

public class Foxy extends Monster {
    private String name = "Foxy";

    //重写父类方法
    //这个方法应该覆盖父类方法来描述每个电子动物的独特能力
    @Override
    public void useUniqueAbility() {
        System.out.println("Foxy can only be blocked by close door.");
    }


    //重写父类方法
    //这个方法应该覆盖在Monster类中使用相同的方法来指定怪物的数量减少手电筒的电池。
    @Override
    public int getBatteryReduction() {
        return 0;
    }

    //返回对象名字
    @Override
    public String toString() {
        return this.name;
    }
}
