package com.techreloded.tests.singleton;

import com.techreloded.designpattern.singleton.EagerSingletonClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EagerSingletonClassTest {

    @Test
    public void testSingleton() {

        EagerSingletonClass instance1 = EagerSingletonClass.getInstance();
        EagerSingletonClass instance2 = EagerSingletonClass.getInstance();
        System.out.println("checking singleton objects equality");
        assertEquals(true, instance1==instance2);

    }

}
