package com.uwjx.interview.junior.basic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : Hugh https://hughwang.me
 * @date : 2018/8/20 18:54
 */
public class 第2题_运算Test {

    @Test
    public void t1() {

        int a = 8;
        int b = a--;
        int c = 0;
        if(a > b & ++c > 0){
            a--;
            b--;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}