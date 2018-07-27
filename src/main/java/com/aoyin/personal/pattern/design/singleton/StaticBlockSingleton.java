/**
 * Aoyin.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.aoyin.personal.pattern.design.singleton;

/**
 * @author aoyin
 * @version $Id: StaticBlockSingleton.java, v 0.1 2018年07月27日 2:21 PM aoyin Exp $
 *
 *
 * 优势：
 *  1. 不存在多线程安全性问题
 *  2. 防止反射打破单例
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
        instance = new StaticBlockSingleton();
    }

    private StaticBlockSingleton(){
        if(null != instance) {
            throw new IllegalStateException();
        }
    }

    /**
     * Getter method for property instance.
     *
     * @return property value of instance
     */
    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public void say() {
        System.out.println("StaticBlockSingleton");
    }

    public static void main(String[] args) {
        StaticBlockSingleton.getInstance().say();
    }


}