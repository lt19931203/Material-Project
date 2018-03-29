package com.md.project.config;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by TT on 2018/3/27.
 */

public interface TicketApi {

    @GET(URLS.MOVIE_DETAIL)
    Call<String> getMovieImages(@Query("locationId") int locationId,
                                @Query("movieId") int movieId);

    @GET(URLS.MOVIE_COMMENTS)
    Call<String> getMovieImages(@Query("movieId") int movieId);
}
