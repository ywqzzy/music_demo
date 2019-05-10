package com.example.music_demo.activities;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.music_demo.R;
import com.example.music_demo.activities.BaseActivity;
import com.example.music_demo.adapters.MusicGridAdapter;
import com.example.music_demo.adapters.MusicListAdapter;
import com.example.music_demo.views.GridSpaceItemDecoration;

public class MainActivity extends BaseActivity {

    private RecyclerView mRvGrid;
    private MusicGridAdapter mGridAdapter;

    private RecyclerView mRvList;
    private MusicListAdapter mListAdapter;
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
        mRvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize),mRvGrid));
        mRvGrid.setNestedScrollingEnabled(false);
        mGridAdapter = new MusicGridAdapter(this);
        mRvGrid.setAdapter(mGridAdapter);

        mRvList = fd(R.id.rv_list);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.setNestedScrollingEnabled(false);
        mListAdapter = new MusicListAdapter(this);
        mRvList.setAdapter(mListAdapter);
    }
}
