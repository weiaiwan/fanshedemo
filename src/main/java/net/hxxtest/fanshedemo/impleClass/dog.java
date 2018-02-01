package net.hxxtest.fanshedemo.impleClass;

import net.hxxtest.fanshedemo.inter.AnimalInterface;

public class dog implements AnimalInterface {

    @Override
    public void sleep() {
        System.out.println("dog sleeping...");
    }
    @Override
    public void eat() {
        System.out.println("dog eating...");
    }
}
