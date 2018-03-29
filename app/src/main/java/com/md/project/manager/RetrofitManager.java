package com.md.project.manager;

import com.md.project.config.CommonApi;
import com.md.project.config.Constants;
import com.md.project.config.TicketApi;
import com.md.project.config.URLS;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Network的单例管理类
 */

public class RetrofitManager {

    private static OkHttpClient okHttpClient;
    private static Retrofit retrofit;

    private RetrofitManager() {
    }

    private static CommonApi commonApi;
    private static TicketApi ticketApi;

    public static CommonApi getCommonApi() {
        if (commonApi == null) {
            synchronized (RetrofitManager.class) {
                if (commonApi == null) {
                    okHttpClient = new OkHttpClient.Builder()
                            .readTimeout(Constants.PROTOCOL_TIMEOUT, TimeUnit.SECONDS)
                            .build();

                    commonApi = new Retrofit.Builder()
                            .baseUrl(URLS.BASE_URL_COMMON)
                            .client(okHttpClient)
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build()
                            .create(CommonApi.class);
                }
            }
        }
        return commonApi;
    }

    public static TicketApi getTicketApi() {
        if (ticketApi == null) {
            synchronized (RetrofitManager.class) {
                if (ticketApi == null) {
                    okHttpClient = new OkHttpClient.Builder()
                            .readTimeout(Constants.PROTOCOL_TIMEOUT, TimeUnit.SECONDS)
                            .build();

                    ticketApi = new Retrofit.Builder()
                            .baseUrl(URLS.BASE_URL_TICKET)
                            .client(okHttpClient)
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                            .create(TicketApi.class);
                }
            }
        }
        return ticketApi;
    }
}
