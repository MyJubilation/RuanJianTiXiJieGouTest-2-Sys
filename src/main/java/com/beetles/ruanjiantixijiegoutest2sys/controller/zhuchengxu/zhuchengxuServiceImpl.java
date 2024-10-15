package com.beetles.ruanjiantixijiegoutest2sys.controller.zhuchengxu;

import org.springframework.stereotype.Service;

/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
@Service
public class zhuchengxuServiceImpl implements zhuchengxuService {

    public int math(int num){
        zhuchengxu zhuchengxu = new zhuchengxu();

        return zhuchengxu.math(num);
    }


}
