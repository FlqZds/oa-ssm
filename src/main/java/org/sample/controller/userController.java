package org.sample.controller;

import com.alibaba.fastjson2.JSON;
import org.sample.common.info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@CrossOrigin("*")
@ResponseBody
public class userController {
    @Resource
    private org.sample.service.userService use;


    @RequestMapping("asd")
    public String showInfo(@RequestParam("name") String name1) {

        String asd = use.asd();

        String asd1 = use.asd();

        String s = JSON.toJSONString(new info("200", "成功进来了", name1, asd1));

        return s;
    }


    @RequestMapping("qwe")
    public String showA(String name, ModelMap modelMap) {

        System.out.println("成功进来了" + name);
//        String asd = use.asd();
        modelMap.put("msg", name + "is coming in……");
        return "index";
    }


}
