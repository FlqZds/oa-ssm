package org.sample.controller;

import com.alibaba.fastjson2.JSON;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.List;


@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class userController {
    @Autowired
    private org.sample.service.userService use;

//    @Resource(name = "validator")
//    private Validator validator;


    @ApiOperation(value = "i_test_api", notes = "前后端分离接口测试")
    @RequestMapping("asd")
    @ResponseBody
    public String showInfo(@ApiParam(name = "name", value = "用户id", required = false) @RequestParam("name") String id, ServletRequest req, ServletResponse res) {


        // 跨域设置(他有时候会失灵，所以要写一下)
//        HttpServletRequest reqs = (HttpServletRequest) req;
//        String curOrigin = reqs.getHeader("Origin");
//        HttpServletResponse response = (HttpServletResponse) res;
//        response.setHeader("Access-Control-Allow-Origin", curOrigin == null ? "true" : curOrigin);
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, HEAD");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "access-control-allow-origin, authority, content-type, version-info, X-Requested-With");
//        response.setContentType("application/json;charset=UTF-8");

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

        int i=1;
        i/=0;
        System.out.println(s);
        return s;
    }


    @ApiOperation(value = "测试接口", notes = "测试接口,前后端不分离接口测试")
    @RequestMapping("qwe")
    public String showA(String name, ModelMap modelMap) {

        System.out.println("成功进来了" + name);
        String asd = use.asd();
        modelMap.put("msg", name + "is coming in……");
        return "a";
    }

    @ApiOperation(value = "测试接口", notes = "测试接口,前后端不分离接口测试")
    @RequestMapping("err")
    public String showDel(String name, ModelMap modelMap) {

        System.out.println(" 我想去测试一下" + name);
        String asd = use.asd();
        modelMap.put("msg", name + "is coming in……");
        return "err";
    }


//    @CrossOrigin(origins = "*")
//    @RequestMapping("register")
//    @ResponseBody
//    public String register(@Valid TbUser user) {
//        String[] register = use.register(user);
//        String soup = JSON.toJSONString(new ErrInfo(ResponseEnum.SUCCESS, register));
//
//        Set<ConstraintViolation<TbUser>> validate = validator.validate(user);
//        if (validate.size() > 0) {
//            String error = "";
//            for (ConstraintViolation<TbUser> constraintViolation : validate) {
//                error += constraintViolation.getMessage() + " ";
//            }
//            return JSON.toJSONString(new ErrInfo(ResponseEnum.PARAM_ERROR, error));
//        } else {
//            return soup;
//        }

//    }

}
