/*
 * File Name:T08_PaperFloding is created on 2020-06-01 11:20 by Zhao Xiaoli
 *
 * Copyright (c) 2020, xiaoyujiaoyu technology All Rights Reserved.
 *
 */
package com.tangwan.algorithm.c07_binary_tree;

/**
 * @author Zhao Xiaoli
 * @Description : T08_PaperFloding
 * @date 2020-06-01 11:20
 * @since JDK 1.8
 */
public class T08_PaperFloding {
    public static void main(String[] args) {
        int N = 3;
        printAllFolds(N);

    }

    public static void printAllFolds(int N) {
        printProcess(1, N, true);
    }

    // 递归过程，来到了某一个节点，
    // i是节点的层数，N一共的层数，down == true  凹    down == false 凸
    public static void printProcess(int i, int N, boolean down) {
        if (i > N) {
            return;
        }
        printProcess(i + 1, N, true);
        System.out.println(down ? "凹 " : "凸 ");
        printProcess(i + 1, N, false);
    }
}
