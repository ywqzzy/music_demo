package com.example.music_demo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.example.music_demo.R;
import com.example.music_demo.activities.LoginActivity;

public class UserUtils {

    public static boolean validateLogin(Context context,String phone, String password) {
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

    public static void logout(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);

        //  清理task栈  并新生成task栈
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

        //  定义activity跳转动画
        ((Activity)context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);
    }
}
