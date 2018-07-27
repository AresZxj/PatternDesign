/**
 * Aoyin.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.aoyin.personal.pattern.design.singleton;

/**
 * @author aoyin
 * @version $Id: FastInitSingleton.java, v 0.1 2018年07月27日 1:42 PM aoyin Exp $
 *
 * 优势：
 *  1. 线程安全
 *  2. 防止反射构造
 *
 * 劣势：
 *  1. 无懒加载
 */
public class FastInitSingleton {
    private static final FastInitSingleton instance = new FastInitSingleton();


    public void say() {
        System.out.println("FastInitSingleton");
    }

    private FastInitSingleton() {
        if(null != instance) {
            throw new IllegalStateException();
        }
    }

    /**
     * Getter method for property instance.
     *
     * @return property value of instance
     */
    public static FastInitSingleton getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        FastInitSingleton.getInstance().say();
    }
}