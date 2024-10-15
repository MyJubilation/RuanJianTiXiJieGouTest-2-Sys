package com.beetles.ruanjiantixijiegoutest2sys.controller;

import com.beetles.ruanjiantixijiegoutest2sys.controller.guandao.guandaoService;
import com.beetles.ruanjiantixijiegoutest2sys.controller.mianxiangduixiang.mianxiangduixiangService;
import com.beetles.ruanjiantixijiegoutest2sys.controller.shiijan.shijianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author beetles
 * @date 2024/10/15
 * @Description
 */
@Controller
public class testController {

    @Autowired
    private com.beetles.ruanjiantixijiegoutest2sys.controller.zhuchengxu.zhuchengxuService zhuchengxuService;
    @Autowired
    private shijianService shijianService;
    @Autowired
    private guandaoService guandaoService;
    @Autowired
    private mianxiangduixiangService mianxiangduixiangService;

    @RequestMapping({"/","/index","/index.html"})
    public String indexPage(){

        return "test/index";
    }

    @RequestMapping("/zhuchengxu")
    public String zhuchengxu(){
        return "test/zhuchengxu/zhuchengxu";
    }
    @RequestMapping("/zhuchengxu/math")
    @ResponseBody
    public int zhuchengxuMath(){

        return zhuchengxuService.math(100);
    }

    @RequestMapping("/mianxiangduixiang")
    public String mianxiangduixiang(){
        return "test/mianxiangduixiang/mianxiangduixiang";
    }
    @RequestMapping("/mianxiangduixiang/math")
    @ResponseBody
    public int mianxiangduixiangMath(){
        return mianxiangduixiangService.math(100);
    }

    @RequestMapping("/shijian")
    public String shijian(){
        return "test/shijian/shijian";
    }
    @RequestMapping("/shijian/math")
    @ResponseBody
    public int shijianMath(){
        return shijianService.math(100);
    }

    @RequestMapping("/guandao")
    public String guandao(){
        return "test/guandao/guandao";
    }
    @RequestMapping("/guandao/math")
    @ResponseBody
    public int guandaoMath(){
        return guandaoService.math(100);
    }
}
