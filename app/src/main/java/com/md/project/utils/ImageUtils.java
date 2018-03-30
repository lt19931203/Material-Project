package com.md.project.utils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.md.project.config.MyApplication;

/**
 * Created by TT on 2018/3/30.
 */

public class ImageUtils {
    public static void display(String url, ImageView imageView) {
        Glide.with(MyApplication.getContext()).load(url).into(imageView);
    }
}
