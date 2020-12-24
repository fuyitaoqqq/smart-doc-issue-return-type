package com.example.demo;

/**
 * @author fuyitao
 * @date 2020/12/24
 */
public class Response<T> {

    private String state;

    private T data;

    private String msg;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
