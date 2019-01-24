package com.example.chaiwatluecha.dpmvp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.chaiwatluecha.dpmvp.R;
import com.example.chaiwatluecha.dpmvp.item.NewRegisterCheckResponse;
import com.example.chaiwatluecha.dpmvp.manager.WebServiceModel;
import com.example.chaiwatluecha.dpmvp.manager.api.ResponseListener;
import com.example.chaiwatluecha.dpmvp.manager.result.BaseResponse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebServiceModel.getInstance().requestHomeBannerList(48, "Tong", new ResponseListener() {
            @Override
            public void response(BaseResponse baseResponse, String returnCode) {
                NewRegisterCheckResponse val = (NewRegisterCheckResponse) baseResponse;
                Log.d("aaaaaaaaa",baseResponse.getReturnCode());
                Log.d("aaaaaaaaa",val.getResult().getData().getEmail());
                Log.d("aaaaaaaaa",val.getResult().getData().getMobileNumber());
                Log.d("aaaaaaaaa",val.getResult().getData().isEmailVerify()+"");
                Log.d("aaaaaaaaa",val.getResult().getData().isMobileVerify()+"");

                Toast.makeText(MainActivity.this,
                        val.getResult().getData().getEmail()
                        +"\n"+val.getResult().getData().getMobileNumber(),Toast.LENGTH_LONG)
                        .show();


                int qcc = 2;
            }
            @Override
            public void showMsg(String msg) {
                Log.d("aaaaaaaaa",msg);
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
