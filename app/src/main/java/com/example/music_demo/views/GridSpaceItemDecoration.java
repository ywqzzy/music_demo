package com.example.music_demo.views;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class GridSpaceItemDecoration extends RecyclerView.ItemDecoration {

    private int mSpace;
    public GridSpaceItemDecoration(int space, RecyclerView parent) {
        mSpace = space;
        getRecyclerViewOffsets(parent);
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View itemView, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect,itemView,parent,state);

        outRect.left = mSpace;
/*
        if(parent.getChildLayoutPosition(itemView) % 3 == 0 ) {
            outRect.left = 0;
        }
  */


    }

    private void getRecyclerViewOffsets (RecyclerView parent) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)parent.getLayoutParams();
        layoutParams.leftMargin = -mSpace;
        parent.setLayoutParams(layoutParams);

    }
}
