package com.techreloded.designpattern.singleton;

public class SingletonUsingInnerClass {

    SingletonUsingInnerClass(){}

    private static class LazySingleton{
        private static final SingletonUsingInnerClass  SINGLETON_INSTANCE = new SingletonUsingInnerClass();
    }

    public static SingletonUsingInnerClass getInstance(){
        return LazySingleton.SINGLETON_INSTANCE;
    }
}
