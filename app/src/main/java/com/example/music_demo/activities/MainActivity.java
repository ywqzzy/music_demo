package com.example.music_demo.activities;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.music_demo.R;
import com.example.music_demo.activities.BaseActivity;
import com.example.music_demo.adapters.MusicGridAdapter;

public class MainActivity extends BaseActivity {

    private RecyclerView mRvGrid;
    private MusicGridAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        initNavBar(false, "萝卜音乐",true);
        mRvGrid = fd(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(this,3));
        mAdapter = new MusicGridAdapter(this);
        mRvGrid.setAdapter(mAdapter);

    }
}
