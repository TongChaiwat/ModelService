package com.example.chaiwatluecha.dpmvp.manager.result;


public class BaseResponse<T> {
    public String TAG = getClass().getSimpleName();

    private String return_code;
    private String message;
    private String serverTime;
    private BaseResult<T> result;

    public String getReturnCode() {
        return return_code;
    }

    public String getMessage() {
        return message;
    }

    public void setReturnCode(String returnCode) {
        this.return_code = returnCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    public String getServerTime() {
        return serverTime;
    }

    public BaseResult<T> getResult() {
        return result;
    }

    public boolean isValid() {
        return return_code.equals("0");
    }
}
