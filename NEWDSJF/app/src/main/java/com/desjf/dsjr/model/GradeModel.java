package com.desjf.dsjr.model;

/**
 * @Author YinL
 * @Date 2018/1/31 0031
 * @Describe  风险测评  题目上交返回值
 */

public class GradeModel {
    private String result;
    private boolean status;
    private String message;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
