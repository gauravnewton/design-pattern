package com.techreloded.tests.singleton;

import com.techreloded.designpattern.singleton.SingletonUsingInnerClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonUsingInnerClassTest {
    @Test
    public void testSingleton() {

        SingletonUsingInnerClass instance1 = SingletonUsingInnerClass.getInstance();
        SingletonUsingInnerClass instance2 = SingletonUsingInnerClass.getInstance();
        System.out.println("checking singleton objects equality");
        assertEquals(true, instance1==instance2);
    }
}
