package net.hxxtest.fanshedemo.impleClass;

import net.hxxtest.fanshedemo.inter.AnimalInterface;

public class cat implements AnimalInterface{
    @Override
    public void eat() {
        System.out.println("cat eating...");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleeping...");
    }
}
