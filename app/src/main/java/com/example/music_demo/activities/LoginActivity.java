package com.example.music_demo.activities;

import android.os.Bundle;
import android.view.View;

import com.example.music_demo.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView () {
        initNavBar(false,"登陆", false);
    }

    /**
     * 注册点击事件
     */
    public void onRegisterClick(View v) {

    }

}
