package com.techreloded.tests.singleton;

import com.techreloded.designpattern.singleton.SingletonSerializeAndDeserialize;

import java.io.*;

public class SerializeAndDeserializeTest {

    static SingletonSerializeAndDeserialize instanceOne = SingletonSerializeAndDeserialize.getInstance();

    public static void main(String[] args) {
        try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(instanceOne);
            out.close();
            instanceOne.setX(200);
            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            SingletonSerializeAndDeserialize instanceTwo = (SingletonSerializeAndDeserialize) in.readObject();
            in.close();
            System.out.println(instanceOne.getX());
            System.out.println(instanceTwo.getX());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
