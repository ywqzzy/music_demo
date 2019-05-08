package com.example.music_demo.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.ToastUtils;

public class UserUtils {

    public static boolean validateLogin(Context context,String phone, String password) {
        //RegexUtils.isMobileSimple(phone);

        if(!RegexUtils.isMobileExact(phone)) {
            Toast.makeText(context,"无效手机号",Toast.LENGTH_SHORT).show();
            return false;
        }

        if(TextUtils.isEmpty(password)) {
            Toast.makeText(context,"请输入密码",Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}
