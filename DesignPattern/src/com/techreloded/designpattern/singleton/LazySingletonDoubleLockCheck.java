package com.techreloded.designpattern.singleton;

public class LazySingletonDoubleLockCheck {

    private static volatile LazySingletonDoubleLockCheck singletonInstance = null;

    //making constructor as private to prevent access to outsiders
    private LazySingletonDoubleLockCheck() {

    }

    public static LazySingletonDoubleLockCheck getInstance(){
        if(singletonInstance==null){
            synchronized (LazySingleton.class) {
                if(singletonInstance ==null){
                    singletonInstance = new LazySingletonDoubleLockCheck();
                }
            }
        }
        return singletonInstance;
    }
}
