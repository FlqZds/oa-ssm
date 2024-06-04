package org.sample.controller;

import com.alibaba.fastjson2.JSON;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.sample.common.formValid.pojoValidator;
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

import javax.validation.Valid;
import java.util.List;

@Controller
@CrossOrigin("*")
public class userController {
    @Autowired
    private org.sample.service.userService use;


    @ApiOperation(value = "i_test_api", notes = "前后端分离接口测试")
    @RequestMapping("asd")
    @ResponseBody
    public String showInfo(@ApiParam(name = "name", value = "用户id", required = true) @RequestParam("name") String id) {


        int i = Integer.parseInt(id);
        TbUser tbUser = use.findUser(i);

        String s = JSON.toJSONString(new ErrInfo(ResponseEnum.SUCCESS, tbUser));

        System.out.println(s);
        return s;
    }

    @RequestMapping("ars")
    @ResponseBody
    public String showInfo() {

        List<TbUser> tbUsers = use.findUAllser();

        String s = JSON.toJSONString(new ErrInfo(ResponseEnum.SUCCESS, tbUsers));

        System.out.println(s);
        return s;
    }


    @ApiOperation(value = "测试接口", notes = "测试接口,前后端不分离接口测试")
    @RequestMapping("qwe")
    public String showA(String name, ModelMap modelMap) {

        System.out.println("成功进来了" + name);
        String asd = use.asd();
        modelMap.put("msg", name + "is coming in……");
        return "index.jsp";
    }


    @RequestMapping("register")
    @ResponseBody
    public String register(@Valid TbUser user) {
        String[] register = use.register(user);
        String soup = JSON.toJSONString(new ErrInfo(ResponseEnum.SUCCESS, register));
                boolean validate = pojoValidator.validate(user);
        return validate? soup : JSON.toJSONString(new ErrInfo(ResponseEnum.PARAM_ERROR, "参数错误"));


    }

}
