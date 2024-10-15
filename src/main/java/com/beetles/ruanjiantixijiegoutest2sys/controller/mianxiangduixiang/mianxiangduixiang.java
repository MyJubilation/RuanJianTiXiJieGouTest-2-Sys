package com.beetles.ruanjiantixijiegoutest2sys.controller.mianxiangduixiang;

/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
public class mianxiangduixiang {
    public int math(int num) {
        mianxiangduixiang finder = new mianxiangduixiang();
        return finder.printPrimesUpTo(100);

    }
    public int printPrimesUpTo(int limit) {
        int cnt = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    private boolean isPrime(int number) {
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
