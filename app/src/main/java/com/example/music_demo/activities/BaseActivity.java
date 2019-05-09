package com.example.music_demo.activities;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.music_demo.R;

public class BaseActivity extends Activity {
    private ImageView mIvBack,mIvMe;
    private TextView mTvTitle;

    protected <T extends View> T fd(@IdRes int id) {
        return findViewById(id);
    }

    protected void initNavBar(boolean isShowBack,String title, boolean isShowMe) {
        mIvBack = fd(R.id.iv_back);
        mIvMe = fd(R.id.iv_me);
        mTvTitle = fd(R.id.tv_title);

        mIvBack.setVisibility(isShowBack? View.VISIBLE : View.GONE);
        mIvMe.setVisibility(isShowMe? View.VISIBLE : View.GONE);

        mTvTitle.setText(title);

        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        //注释掉activity本身的过渡动画
        overridePendingTransition(0, 0);
    }
}
