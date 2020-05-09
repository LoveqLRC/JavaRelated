/*
 * File Name:T02_CMS_Eden is created on 2020-04-16 16:34 by tangwan
 *
 * Copyright (c) 2020, tangwan All Rights Reserved.
 *
 */
package com.tangwan.jvm.c5_gc;

/**
 * @author tangwan
 * @Description : T02_CMS_Eden
 * <p>
 * -Xmn10m = -XX:newSize=10m -XX:MaxNewSize=10m -XX:NewRatio -Xlog:gc.log
 * @date 2020-04-16 16:34
 * @since JDK 1.8
 */
public class T02_CMS_Eden {
    public static void main(String[] args) {
        byte[] b1 = new byte[4 * 1024 * 1024];
        b1 = null;

        System.out.println("----------------");
        byte[] b2 = new byte[4 * 1024 * 1024];
    }
}
