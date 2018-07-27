/**
 * Aoyin.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package design.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.aoyin.personal.pattern.design.singleton.ClassStaticInitSingleton;
import com.aoyin.personal.pattern.design.singleton.EnumSingleton;
import com.aoyin.personal.pattern.design.singleton.FastInitSingleton;
import com.aoyin.personal.pattern.design.singleton.LazySingleton;
import com.aoyin.personal.pattern.design.singleton.StaticBlockSingleton;
import org.testng.annotations.Test;

/**
 * @author aoyin
 * @version $Id: ReflectionTest.java, v 0.1 2018年07月27日 2:34 PM aoyin Exp $
 */
public class ReflectionTest {

    @Test(expectedExceptions = InvocationTargetException.class)
    public void ClassStaticInitSingletonTest() throws NoSuchMethodException, InstantiationException, IllegalAccessException,
            InvocationTargetException {
        Constructor<?> constructor = ClassStaticInitSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ClassStaticInitSingleton instance1 = (ClassStaticInitSingleton) constructor.newInstance();
        instance1.say();
    }


    @Test(expectedExceptions = NoSuchMethodException.class)
    public void EnumSingletonTest() throws NoSuchMethodException, InstantiationException, IllegalAccessException,
            InvocationTargetException {
        Constructor<?> constructor = EnumSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSingleton instance1 = (EnumSingleton) constructor.newInstance();
        instance1.getInstance();
    }

    @Test(expectedExceptions = InvocationTargetException.class)
    public void FastInitSingletonTest() throws NoSuchMethodException, InstantiationException, IllegalAccessException,
            InvocationTargetException {
        Constructor<?> constructor = FastInitSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        FastInitSingleton instance1 = (FastInitSingleton) constructor.newInstance();
        instance1.say();
    }

    @Test(expectedExceptions = InvocationTargetException.class)
    public void LazySingletonTest() throws NoSuchMethodException, InstantiationException, IllegalAccessException,
            InvocationTargetException {
        Constructor<?> constructor = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton instance1 = (LazySingleton) constructor.newInstance();
        instance1.say();
    }
    @Test(expectedExceptions = InvocationTargetException.class)
    public void StaticBlockSingletonTest() throws NoSuchMethodException, InstantiationException, IllegalAccessException,
            InvocationTargetException {
        Constructor<?> constructor = StaticBlockSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticBlockSingleton instance1 = (StaticBlockSingleton) constructor.newInstance();
        instance1.say();
    }
}