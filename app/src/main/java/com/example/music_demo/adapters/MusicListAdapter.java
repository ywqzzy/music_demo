package com.example.music_demo.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.music_demo.R;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.ViewHolder> {

    private Context mContext;
    private View mItemView;
    private RecyclerView mRv;
    private boolean isCalculatedRvHeight;

    public MusicListAdapter(Context context,RecyclerView rv) {
        mContext = context;
        mRv = rv;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        mItemView = LayoutInflater.from(mContext).inflate(R.layout.item_list_music,viewGroup,false);
        return  new ViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        setRecyclerViewHeight();

        Glide.with(mContext)
                .load("https://img1.doubanio.com/view/subject/l/public/s28026858.jpg")
                .into(viewHolder.ivIcon);

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    private void setRecyclerViewHeight () {
        if(isCalculatedRvHeight || mRv == null) return;
        isCalculatedRvHeight = true;
        RecyclerView.LayoutParams itemViewlp = (RecyclerView.LayoutParams)mItemView.getLayoutParams();

        int itemCount = getItemCount();
        int recyclerViewHeight = itemViewlp.height * itemCount;
        LinearLayout.LayoutParams rvLp =  (LinearLayout.LayoutParams)mRv.getLayoutParams();
        rvLp.height = recyclerViewHeight;
        mRv.setLayoutParams(rvLp);

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivIcon;

         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             ivIcon = itemView.findViewById(R.id.iv_icon);
         }
     }
}
