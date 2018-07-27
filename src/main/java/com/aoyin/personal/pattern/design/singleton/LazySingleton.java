/**
 * Aoyin.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.aoyin.personal.pattern.design.singleton;

/**
 * @author aoyin
 * @version $Id: LazySingleton.java, v 0.1 2018年07月27日 1:06 PM aoyin Exp $
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public void say() {
        System.out.println("hello");
    }

    /**
     * Getter method for property instance.
     *
     * @return property value of instance
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                LazySingleton init = instance;
                if (init == null) {
                    synchronized (LazySingleton.class) {
                        instance = new LazySingleton();
                    }
                }

            }
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton.getInstance().say();
    }
}