package com.example.chaiwatluecha.dpmvp.item;

import com.example.chaiwatluecha.dpmvp.manager.result.BaseResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewRegisterCheckResponse extends BaseResponse<NewRegisterCheckResponse.NewRegisterCustomer> {

    public class NewRegisterCustomer {
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("mobile_number")
        @Expose
        private String mobileNumber;
        @SerializedName("create_date")
        @Expose
        private String createDate;
        @SerializedName("email_verify")
        @Expose
        private boolean emailVerify;
        @SerializedName("mobile_verify")
        @Expose
        private boolean mobileVerify;


        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public boolean isEmailVerify() {
            return emailVerify;
        }

        public void setEmailVerify(boolean emailVerify) {
            this.emailVerify = emailVerify;
        }

        public boolean isMobileVerify() {
            return mobileVerify;
        }

        public void setMobileVerify(boolean mobileVerify) {
            this.mobileVerify = mobileVerify;
        }
    }


}
