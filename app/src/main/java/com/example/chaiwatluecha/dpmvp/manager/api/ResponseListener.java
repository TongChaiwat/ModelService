package com.example.chaiwatluecha.dpmvp.manager.api;

import com.example.chaiwatluecha.dpmvp.manager.result.BaseResponse;

public interface ResponseListener {
    void response(BaseResponse baseResponse, String returnCode);
    void showMsg(String msg);
}
