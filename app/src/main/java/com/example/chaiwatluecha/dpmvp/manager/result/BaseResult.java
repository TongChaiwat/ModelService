package com.example.chaiwatluecha.dpmvp.manager.result;

public class BaseResult<T> {
    private String lang;
    private T data;

    public String getLang() {
        return lang;
    }

    public T getData() {
        return data;
    }
}
