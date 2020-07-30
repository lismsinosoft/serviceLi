package com.sinosoft.capacity.dto.base;

import java.io.Serializable;

public class ResultMsgDTO implements Serializable {

    private String code;

    private String msg;

    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static ResultMsgDTO succ(Object data){
        ResultMsgDTO resultMsgDTO = new ResultMsgDTO();
        resultMsgDTO.setCode("1");
        resultMsgDTO.setData(data);
        return resultMsgDTO;
    }
    public static ResultMsgDTO fail(String code, String msg){
        ResultMsgDTO resultMsgDTO = new ResultMsgDTO();
        resultMsgDTO.setCode(code);
        resultMsgDTO.setMsg(msg);
        return resultMsgDTO;
    }
}
