/*
 * File Name:T01_ReentrantLock1 is created on 2020-04-21 17:31 by Zhao Xiaoli
 *
 * Copyright (c) 2020, xiaoyujiaoyu technology All Rights Reserved.
 *
 */
package com.tangwan.juc.c6_AQSLock;

import java.util.concurrent.TimeUnit;

/**
 * @author Zhao Xiaoli
 * @Description : T01_ReentrantLock1
 * @date 2020-04-21 17:31
 * @since JDK 1.8
 */
public class T01_ReentrantLock1 {

    synchronized void m1() {
        for (int i = 0; i < 10; i++) {

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(i);

            if (i == 2) {
                m2();
            }
        }
    }

    synchronized void m2() {
        System.out.println("m2 ...");
    }

    public static void main(String[] args) throws InterruptedException {
        T01_ReentrantLock1 t = new T01_ReentrantLock1();
        new Thread(t::m1).start();
        TimeUnit.SECONDS.sleep(1);
    }
}
