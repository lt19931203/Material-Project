package com.md.project.config;

import com.md.project.mvp.model.HotCityModel;
import com.md.project.mvp.model.HotMovieModel;
import com.md.project.mvp.model.MovieComingNewModel;
import com.md.project.mvp.model.MovieCredits;
import com.md.project.mvp.model.MovieImages;
import com.md.project.mvp.model.MovieOnSaleModel;
import com.md.project.mvp.model.MoviePreviewAndFeature;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by TT on 2018/3/27.
 */

public interface CommonApi {

    /**
     * 获取热门城市信息，不同的城市，返回不同的电影结果
     *
     * @return
     */
    @GET(URLS.HOT_CITIES)
    Observable<HotCityModel> getHotCities();

    /**
     * 根据地区，获得电影信息,(包括正在热映和即将上映)
     *
     * @param locationId
     * @return
     */
    @GET(URLS.HOT_MOVIES_ON_SALE)
    Observable<MovieOnSaleModel> getHotMoviesOnSale(@Query("locationId") int locationId);

    /**
     * 正在热映
     *
     * @param locationId
     * @return
     */
    @GET(URLS.HOT_MOVIES)
    Observable<HotMovieModel> getHotMovies(@Query("locationId") int locationId);

    /**
     * 即将上映
     *
     * @param locationId
     * @return
     */
    @GET(URLS.MOVIE_COMING_NEW)
    Observable<MovieComingNewModel> getMovieComingNew(@Query("locationId") int locationId);

    /**
     * 演职员表
     *
     * @param movieId
     * @return
     */
    @GET(URLS.MOVIE_CREDITS)
    Observable<MovieCredits> getMovieCredits(@Query("movieId") int movieId);

    /**
     * 预告片&拍摄花絮
     *
     * @param pageIndex
     * @param movieId
     * @return
     */
    @GET(URLS.MOVIE_PREVIEW_AND_FEATURE)
    Observable<MoviePreviewAndFeature> getMoviePreviewAndFeature(@Query("pageIndex") int pageIndex,
                                                                 @Query("movieId") int movieId);

    /**
     * 剧照
     *
     * @param movieId
     * @return
     */
    @GET(URLS.MOVIE_IMAGES)
    Observable<MovieImages> getMovieImages(@Query("movieId") int movieId);


}
