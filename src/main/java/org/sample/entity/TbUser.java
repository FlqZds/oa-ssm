package org.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUser {


    private Integer tbUser;

    private String username;

    private String userpassword;

    private String account;

}