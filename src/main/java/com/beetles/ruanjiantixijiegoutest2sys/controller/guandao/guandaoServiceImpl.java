package com.beetles.ruanjiantixijiegoutest2sys.controller.guandao;

import org.springframework.stereotype.Service;

/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
@Service
public class guandaoServiceImpl implements guandaoService {

    public int math(int num){
        guandao guandao = new guandao();

        return guandao.math(num);
    }


}
