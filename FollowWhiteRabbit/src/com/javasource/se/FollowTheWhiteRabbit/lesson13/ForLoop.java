package com.javasource.se.FollowTheWhiteRabbit.lesson13;


//https://metanit.com/java/tutorial/2.4.php массивы

public class ForLoop {

    int [] array= {1,2, 3};
    int q;
    public void foo (){
        for (int element: array) {
            System.out.println(element);
        }
        for ( q = 0; q<10; q++ ) {
            System.out.println("q" + "= " + q);
        }
    }
}
