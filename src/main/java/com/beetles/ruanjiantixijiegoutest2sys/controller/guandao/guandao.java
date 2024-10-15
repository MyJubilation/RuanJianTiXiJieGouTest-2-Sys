package com.beetles.ruanjiantixijiegoutest2sys.controller.guandao;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
public class guandao {
    public int math(int num) {
        IntStream.range(2, 100)
                .filter(guandao::isPrime)
                .forEach(System.out::println);
        return 25;
    }
    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, (int) Math.sqrt(number) + 1)
                .noneMatch(i -> number % i == 0);
    }
}
