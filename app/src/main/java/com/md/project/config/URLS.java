package com.md.project.config;

/**
 * Created by TT on 2018/3/27.
 */

public class URLS {
    public static final String BASE_URL_COMMON = "https://api-m.mtime.cn/";
    public static final String BASE_URL_TICKET = "https://ticket-api-m.mtime.cn/";
    //获取城市信息
    public static final String HOT_CITIES = "Showtime/HotCitiesByCinema.api";
    //正在售票(包括正在热映和即将上映)
    public static final String HOT_MOVIES_ON_SALE = "PageSubArea/HotPlayMovies.api";
    //正在热映
    public static final String HOT_MOVIES = "Showtime/LocationMovies.api";
    //即将上映
    public static final String MOVIE_COMING_NEW = "Movie/MovieComingNew.api";
    //演职员表
    public static final String MOVIE_CREDITS = "Movie/MovieCreditsWithTypes.api";
    //预告片&拍摄花絮
    public static final String MOVIE_PREVIEW_AND_FEATURE = "Movie/Video.api";
    //剧照
    public static final String MOVIE_IMAGES = "Movie/ImageAll.api";

    /*----------------------- TicketApi -----------------------*/
    //影片详情
    public static final String MOVIE_DETAIL = "movie/detail.api";
    //影片评论
    public static final String MOVIE_COMMENTS = "movie/hotComment.api";
}
