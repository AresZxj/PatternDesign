/**
 * Aoyin.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.aoyin.personal.pattern.design.singleton;


/**
 * @author aoyin
 * @version $Id: ClassStaticInitSingleton.java, v 0.1 2018年07月27日 1:52 PM aoyin Exp $
 *
 *
 * 优势：
 *  1. 懒汉模式的内存优化（使用时才初始化）。
 *  2. 饿汉模式的安全性（不会被反射入侵）。
 * 劣势：
 *  1. 编码复杂度高。
 *  2. 徐亚创建class对象，属于永久带，有额外的内存占用开销。
 *
 */
public class ClassStaticInitSingleton {


    private ClassStaticInitSingleton() {
        if(getInstance() == null) {
            throw new IllegalStateException();
        }
    }
    /**
     * Getter method for property instance.
     *
     * @return property value of instance
     */
    public static ClassStaticInitSingleton getInstance() {
        return ClassStaticInitSingletonHolder.instance;
    }

    public void say() {
        System.out.println("ClassStaticInitSingleton");
    }


    private static class ClassStaticInitSingletonHolder {
        private static ClassStaticInitSingleton instance = new ClassStaticInitSingleton();
    }

    public static void main(String[] args) {
        ClassStaticInitSingleton.getInstance().say();
    }
}