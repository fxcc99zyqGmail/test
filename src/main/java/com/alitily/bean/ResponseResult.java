package com.alitily.bean;

import org.springframework.stereotype.Service;

@Service
public class ResponseResult<T> {

    private int respCode;

    private String respMsg;

    private T respData;

    private static <T> ResponseResult<T> response(int respCode, String respMsg, T respData) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setRespCode(respCode);
        responseResult.setRespMsg(respMsg);
        responseResult.setRespData(respData);
        return responseResult;
    }

    public ResponseResult() {
    }

    public ResponseResult(int respCode, String respMsg, T respData) {
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.respData = respData;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public T getRespData() {
        return respData;
    }

    public void setRespData(T respData) {
        this.respData = respData;
    }
}
