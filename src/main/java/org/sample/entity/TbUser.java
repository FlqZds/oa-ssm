package org.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TbUser {


    private Integer tbUser;
//
//    @NotEmpty(message = "用户名不能为空")
    private String username;

//    @NotEmpty(message = "密码不能为空")
//    @Size(min = 6, max = 16, message = "密码长度必须在6-16位之间")
        private String userpassword;

//    @NotEmpty(message = "账号不能为空")
    private String account;


}