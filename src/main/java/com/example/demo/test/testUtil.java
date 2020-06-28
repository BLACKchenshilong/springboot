package com.example.demo.test;

import org.junit.Test;
import org.springframework.stereotype.Component;

import java.io.*;

/**
 * @ClassName testUtil
 * @Description: TODO
 * @Author chenshilong
 * @Date 2020/6/12 0012
 * @Version 1.0
 **/
@Component
public class testUtil {


    @Test
    public void test() throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\6.11流程\\ttt.txt"));
        objectOutputStream.write(1);
        objectOutputStream.writeObject("123");
        objectOutputStream.writeObject("111");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\6.11流程\\ttt.txt"));
        int object = objectInputStream.read();
        Object object1 = objectInputStream.readObject();
        Object object2 = objectInputStream.readObject();
        System.out.println(object);
        System.out.println(object1);
        System.out.println(object2);
    }

}
