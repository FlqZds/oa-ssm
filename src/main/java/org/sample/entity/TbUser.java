package org.sample.entity;

public class TbUser {
    private Integer tbUser;

    private String username;

    private String userpassword;

    private String account;

    public Integer getTbUser() {
        return tbUser;
    }

    public void setTbUser(Integer tbUser) {
        this.tbUser = tbUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }
}