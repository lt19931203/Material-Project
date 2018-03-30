package com.md.project.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.md.project.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by TT on 2018/3/30.
 */

public class MovieSynopsisViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.iv_movie)
    public ImageView ivMovie;
    @BindView(R.id.tv_movie_name)
    public TextView tvMovieName;
    @BindView(R.id.tv_movie_want_see)
    public TextView tvMovieWantSee;
    @BindView(R.id.tv_movie_director)
    public TextView tvMovieDirector;
    @BindView(R.id.tv_movie_actor)
    public TextView tvMovieActor;
    @BindView(R.id.tv_status)
    public TextView tvStatus;

    public MovieSynopsisViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
