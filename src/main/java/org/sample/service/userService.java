package org.sample.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sample.entity.TbUser;
import org.sample.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Data
@Service
@AllArgsConstructor
@NoArgsConstructor
public class userService {
    @Resource
    TbUserMapper tbUserMapper;

    public String asd(){

        return "hello World ……& ^-^";
    }



    public TbUser findUser(Integer id){
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(id);


        return tbUser;
    }
}


