package com.javasource.se.FollowTheWhiteRabbit.lesson9;


//https://metanit.com/java/tutorial/2.3.php Арифметические операции
//https://metanit.com/java/tutorial/2.13.php логические операции
//https://metanit.com/java/tutorial/2.15.php операции присваивания


public class Operation {
    Integer a = 5, b = 7, c;
    String str1 = "hot ", str2 = "java", result;

    public void foo() {
        c = a + b;
        result = str1+str2;
        System.out.println(c);
        System.out.println(result);

        System.out.println(Math.PI + Math.tan(a));
    }
}


