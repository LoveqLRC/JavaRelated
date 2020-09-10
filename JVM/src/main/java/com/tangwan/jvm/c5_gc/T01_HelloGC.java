/*
 * File Name:T01_HelloGC is created on 2020-04-16 16:29 by tangwan
 *
 * Copyright (c) 2020, tangwan All Rights Reserved.
 *
 */
package com.tangwan.jvm.c5_gc;

import java.util.LinkedList;
import java.util.List;

/**
 * @author tangwan
 * @Description : T01_HelloGC
 * -XX:+PrintGCDetails -XX:+UseConcMarkSweepGC -XX:+PrintFlagsFinal -XX:+PrintVMOptions -Xms20m -Xmx20m
 * @date 2020-04-16 16:29
 * @since JDK 1.8
 */
public class T01_HelloGC {
    public static void main(String[] args) {
        System.out.println("HelloGC!");
        List list = new LinkedList();
        for (; ; ) {
            byte[] b = new byte[1024 * 1024];
            list.add(b);
        }
    }
}
