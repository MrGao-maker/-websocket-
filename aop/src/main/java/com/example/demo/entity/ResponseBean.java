package com.example.demo.entity;


public class ResponseBean {
   private int status;

   private String msg;

    public ResponseBean(int status, String msg){
        this.status=status;
        this.msg=msg;
    }

    public ResponseBean ok(ResponseBean responseBean){
        return responseBean;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
