package com.javasource.se.FollowTheWhiteRabbit.lesson10;

//https://metanit.com/java/tutorial/2.14.php

public class ControlOperators {
    int a = 2, b = 2;
    boolean v = true;

    public void foo() {
        if (a > b) {
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }
    }
}