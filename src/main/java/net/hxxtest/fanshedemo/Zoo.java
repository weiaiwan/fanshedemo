package net.hxxtest.fanshedemo;

import net.hxxtest.fanshedemo.inter.AnimalInterface;

public class Zoo {
    public void run(AnimalInterface animal){
        animal.eat();
        animal.sleep();
    }
}
