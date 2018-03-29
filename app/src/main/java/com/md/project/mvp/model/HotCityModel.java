package com.md.project.mvp.model;

import java.util.List;

/**
 * Created by TT on 2018/3/27.
 */

public class HotCityModel implements IMvpModel{

    public List<PBean> p;

    public static class PBean {
        /**
         * count : 304
         * id : 292
         * n : 上海
         * pinyinFull : Shanghai
         * pinyinShort : sh
         */

        public int count;
        public int id;
        public String n;
        public String pinyinFull;
        public String pinyinShort;
    }
}
