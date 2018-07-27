/**
 * Aoyin.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.aoyin.personal.pattern.design.singleton;

/**
 * @author aoyin
 * @version $Id: EnumSingleton.java, v 0.1 2018年07月27日 1:44 PM aoyin Exp $
 */
public enum EnumSingleton {

    INSTANCE;

    private PrivateSingleton instance;


    EnumSingleton() {
        instance = new PrivateSingleton();
    }

    /**
     * Getter method for property instance.
     *
     * @return property value of instance
     */
    public PrivateSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.getInstance().say();
    }


    private class PrivateSingleton {
        public void say() {
            System.out.println("hello");
        }
    }
}
