package com.javasource.se.FollowTheWhiteRabbit.lesson6;


//https://metanit.com/java/tutorial/2.12.php Типы данных
//https://metanit.com/java/tutorial/2.2.php преобразование базовых типов данных

public class Numbers {
    //x+3=5

    static byte a = 126;                                //2^8 = 256                             (от -128 до 127)
    static short b = 777;                               //2^16 = 65.538                         (от -32768 до 32768)
    static int c = 35000;                               //2^32 = 4.294.967.296                  (от -2147483648 до 2147483647)
    static long d = 1_000_000_000_000_000L;             //2^64 = 18.446.744.073.709.551.616     (от –9 223 372 036 854 775 808 до –9 223 372 036 854 775 807)

    static char e = 'C';                                //2^16 = 65.538                         (от 0 до 65535) кодировка Unicode

    static float f = 7.1f;                              //2^32                                  ( от -3.4*10^38 до 3.4*10^38)
    static double g = 6.3;                              //2^64                                  (от ±4.9*10^-324 до ±1.7976931348623157*10^308)

    static boolean h = true;                             //8 bit (в массивах) и 32 bit (не в массивах)


}
