package com.beetles.ruanjiantixijiegoutest2sys.controller.mianxiangduixiang;

import org.springframework.stereotype.Service;

/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
@Service
public class mianxiangduixiangServiceImpl implements mianxiangduixiangService {

    public int math(int num){
        mianxiangduixiang mianxiangduixiang = new mianxiangduixiang();

        return mianxiangduixiang.math(num);
    }


}
