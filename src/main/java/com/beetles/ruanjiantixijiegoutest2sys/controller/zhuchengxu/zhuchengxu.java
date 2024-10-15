package com.beetles.ruanjiantixijiegoutest2sys.controller.zhuchengxu;

import java.util.Scanner;

/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
public class zhuchengxu {
    public int math(int num) {
        int cnt = 0;
        int n = num;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
