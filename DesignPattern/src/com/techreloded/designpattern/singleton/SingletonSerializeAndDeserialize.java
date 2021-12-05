package com.techreloded.designpattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonSerializeAndDeserialize implements Serializable {

    private int x=100;

    private static volatile SingletonSerializeAndDeserialize singletonInstance = new SingletonSerializeAndDeserialize();

    private SingletonSerializeAndDeserialize() {
        System.out.println("inside constructor");
    }

    public static SingletonSerializeAndDeserialize getInstance() {
        return singletonInstance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Object readResolve() throws ObjectStreamException {
        return singletonInstance;
    }

}