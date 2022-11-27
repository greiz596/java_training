package com.javasource.se.FollowTheWhiteRabbit.lesson14;

public class MyArrays {
    int[] array = new int[3];
    Candy[] box = new Candy[5];

    int[] array2 = {10, 3, 7};

    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecond, candyThird};

    Candy[] box3;


    public void foo() {

        System.out.println(box2[1]);

        for (int i = 0; i<array2.length; i++)
        {
            System.out.println(array2[i]);
            System.out.println(array[0]);
        };

        System.out.println(box[0]);
    }
}
