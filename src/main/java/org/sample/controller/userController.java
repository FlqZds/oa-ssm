package org.sample.controller;

import com.alibaba.fastjson2.JSON;
import org.sample.common.result.ErrInfo;
import org.sample.common.result.ResponseEnum;
import org.sample.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin("*")
@ResponseBody
public class userController {
    @Autowired
    private org.sample.service.userService use;


    @RequestMapping("asd")
    public String showInfo(@RequestParam("name") String id) {


        String asd = use.asd();

        int i = Integer.parseInt(id);
        TbUser tbUser = use.findUser(i);

        String s = JSON.toJSONString(new ErrInfo(ResponseEnum.SUCCESS,tbUser));

        return s;
    }


    @RequestMapping("qwe")
    public String showA(String name, ModelMap modelMap) {

        System.out.println("成功进来了" + name);
        String asd = use.asd();
        modelMap.put("msg", name + "is coming in……");
        return "index";
    }


}
