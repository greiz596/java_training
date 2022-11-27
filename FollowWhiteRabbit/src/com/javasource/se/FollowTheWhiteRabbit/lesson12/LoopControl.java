package com.javasource.se.FollowTheWhiteRabbit.lesson12;


//https://metanit.com/java/tutorial/2.6.php циклы

public class LoopControl {
    boolean value = true;
    int a = 0, b = 20;

    public void foo() {
        do {
            a++;
            System.out.println(a);

        } while (a < b);
    }
}
