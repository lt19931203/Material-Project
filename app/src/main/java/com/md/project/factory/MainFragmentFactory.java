package com.md.project.factory;

import android.support.v4.app.Fragment;

import com.md.project.mvp.view.BoxOfficeFragment;
import com.md.project.mvp.view.HotMovieFragment;
import com.md.project.mvp.view.MovieComingNewFragment;
import com.md.project.mvp.view.MovieOnSaleFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * MainActivity中的Fragments
 */

public class MainFragmentFactory {
    //正在售票
    private static final int MOVIE_ON_SALE = 0;
    //正在热播
    private static final int HOT_MOVIES = 1;
    //即将上映
    private static final int MOVIE_COMING_NEW = 2;
    //票房
    private static final int BOX_OFFICE = 3;

    private static Map<Integer, Fragment> mainCacheFragments = new HashMap<>();

    public static Fragment getMainFragment(int position) {
        //定义Fragment对象
        Fragment fragment = null;

        //优先缓存集合中取出来
        if (mainCacheFragments.containsKey(position)) {
            fragment = mainCacheFragments.get(position);
            return fragment;
        }

        switch (position) {
            case MOVIE_ON_SALE:
                fragment = new MovieOnSaleFragment();
                break;
            case HOT_MOVIES:
                fragment = new HotMovieFragment();
                break;
            case MOVIE_COMING_NEW:
                fragment = new MovieComingNewFragment();
                break;
            case BOX_OFFICE:
                fragment = new BoxOfficeFragment();
                break;
        }
        //保存Fragment到集合中
        mainCacheFragments.put(position, fragment);
        return fragment;
    }

    public static int getMainFragmentCount() {
        return 4;
    }

    public static String getMainFragmentTitle(int position) {
        String title = null;
        switch (position) {
            case MOVIE_ON_SALE:
                title = "正在售票";
                break;
            case HOT_MOVIES:
                title = "正在热映";
                break;
            case MOVIE_COMING_NEW:
                title = "即将上映";
                break;
            case BOX_OFFICE:
                title = "实时票房";
                break;
            default:
                break;
        }
        return title;
    }
}
