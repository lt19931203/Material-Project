package com.md.project.mvp.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.md.project.R;
import com.md.project.holder.MovieSynopsisViewHolder;
import com.md.project.manager.RetrofitManager;
import com.md.project.mvp.model.MovieOnSaleModel;
import com.md.project.utils.ImageUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by TT on 2018/3/30.
 */

public class MovieOnSaleFragment extends BaseFragment {
    private static final String TAG = "MovieOnSaleFragment";

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_movie_on_sale, container, false);
        ButterKnife.bind(this, view);

        RetrofitManager
                .getCommonApi()
                .getHotMoviesOnSale(628)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MovieOnSaleModel>() {
                    @Override
                    public void accept(MovieOnSaleModel movieOnSaleModel) throws Exception {
                        initRecyclerView(movieOnSaleModel);
                    }
                });


        return view;
    }

    private void initRecyclerView(final MovieOnSaleModel movieOnSaleModel) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie_synopsis_holder, parent, false);
                //这里带有图片
                return new MovieSynopsisViewHolder(view);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                MovieSynopsisViewHolder movieSynopsisViewHolder = (MovieSynopsisViewHolder) holder;
                MovieOnSaleModel.MoviesBean moviesBean = movieOnSaleModel.movies.get(position);
                ImageUtils.display(moviesBean.img, movieSynopsisViewHolder.ivMovie);
                movieSynopsisViewHolder.tvMovieActor.setText(moviesBean.actorName1);
                movieSynopsisViewHolder.tvMovieDirector.setText(moviesBean.directorName);
                movieSynopsisViewHolder.tvMovieName.setText(moviesBean.titleCn);
                movieSynopsisViewHolder.tvMovieWantSee.setText(String.valueOf(moviesBean.wantedCount));
            }

            @Override
            public int getItemCount() {
                return movieOnSaleModel.movies.size();
            }
        });
    }
}
