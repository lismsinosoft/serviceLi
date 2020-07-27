package com.sinosoft.capacity.dto;

import com.sinosoft.capacity.dto.base.ResultMsgDTO;

public class UserInfoDTO extends ResultMsgDTO {

    private String userName;

    private String password;

    private String sysName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }
}
