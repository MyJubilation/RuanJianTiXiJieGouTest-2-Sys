package com.beetles.ruanjiantixijiegoutest2sys.controller.shiijan;
import java.util.Observable;
import java.util.Observer;
/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
public class shijian {
    public int math(int num) {
        PrimeGenerator generator = new PrimeGenerator();
        generator.addObserver(new PrimeObserver());
        return generator.generatePrimes(100);
    }

}


class PrimeGenerator extends Observable {
    public int generatePrimes(int limit) {
        int cnt=0;
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                setChanged();
                notifyObservers(i);
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

class PrimeObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
