package net.hxxtest.fanshedemo;

import net.hxxtest.fanshedemo.inter.AnimalInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

public class AnimalMain {

    public static void main(String[] args)throws Exception{
        Zoo z = new Zoo();
        ResourceBundle rb = ResourceBundle.getBundle("animalsFile");
        String animalList = rb.getString("list");
        String[] strArray  = animalList.split(",");
        for(int i=0;i<strArray.length;i++){
            String animalName= strArray[i];
            Class c = Class.forName(animalName);
            AnimalInterface obj = (AnimalInterface)c.newInstance();
            z.run(obj);
        }
       /* File animalFile = new File("classpath:config/animalsFile.properties");
        Properties pro = new Properties();
        FileInputStream fil = new FileInputStream("animalFile");
        pro.load(fil);
        for(int i=0;i<pro.size();i++){
            String animalName= pro.getProperty("animal"+i);
            Class c = Class.forName(animalName);
            AnimalInterface obj = (AnimalInterface)c.newInstance();
            z.run(obj);
        }
        fil.close();*/
    }
}
