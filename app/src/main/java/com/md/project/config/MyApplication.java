package com.md.project.config;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * 全局单例，注意需要在清单文件里面进行配置
 */
public class MyApplication extends Application {
    private final String TAG = "MyApplication";

    private static Context context;
    private static Handler mainThreadHandler;

    /**
     * 程序的入口方法
     */
    @Override
    public void onCreate() {
        super.onCreate();
        //上下文
        context = getApplicationContext();
        //主线程的Handler
        mainThreadHandler = new Handler();
    }

    /**
     * 得到上下文
     */
    public static Context getContext() {
        return context;
    }

    /**
     * 得到主线程里面的创建的一个hanlder
     */
    public static Handler getMainThreadHandler() {
        return mainThreadHandler;
    }
}
