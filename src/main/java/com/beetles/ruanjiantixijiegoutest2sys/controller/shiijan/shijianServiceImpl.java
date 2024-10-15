package com.beetles.ruanjiantixijiegoutest2sys.controller.shiijan;

import org.springframework.stereotype.Service;

/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
@Service
public class shijianServiceImpl implements shijianService {

    public int math(int num){
        shijian shijian = new shijian();

        return shijian.math(num);
    }


}
