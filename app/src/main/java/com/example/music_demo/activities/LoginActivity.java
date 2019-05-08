package com.example.music_demo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.music_demo.R;
import com.example.music_demo.utils.UserUtils;
import com.example.music_demo.views.InputView;

import java.net.PasswordAuthentication;

public class LoginActivity extends BaseActivity {

    private InputView mInputPhone,mInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView () {
        initNavBar(false,"登陆", false);

        mInputPhone = fd(R.id.input_phone);
        mInputPassword = fd(R.id.input_password);
    }

    /**
     * 注册点击事件
     */
    public void onRegisterClick(View v) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);

    }

    public void onCommitClick(View v) {
        String phone = mInputPhone.getInputStr();
        String password = mInputPassword.getInputStr();

        if(!UserUtils.validateLogin(this,phone, password)) {
            return;
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
