package com.techreloded.tests.singleton;

import com.techreloded.designpattern.singleton.LazySingleton;
import com.techreloded.designpattern.singleton.LazySingletonDoubleLockCheck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LazySingletonDoubleLockCheckTest {

    @Test
    public void testSingletonDoubleCheck() {

        LazySingletonDoubleLockCheck instance1 = LazySingletonDoubleLockCheck.getInstance();
        LazySingletonDoubleLockCheck instance2 = LazySingletonDoubleLockCheck.getInstance();
        System.out.println("checking singleton objects equality");
        assertEquals(true, instance1==instance2);
        //fail("Not yet implemented");
    }


    @Test
    public void testSingleton() {

        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println("checking singleton objects equality");
        assertEquals(true, instance1==instance2);
        //fail("Not yet implemented");
    }

}