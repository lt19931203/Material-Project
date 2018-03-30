package com.md.project.mvp.model;

import java.util.List;

/**
 * Created by TT on 2018/3/30.
 */

public class MovieOnSaleModel {

    /**
     * count : 15
     * movies : [{"actorName1":"泰尔·谢里丹","actorName2":"奥利维亚·库克","btnText":"","commonSpecial":"斯皮尔伯格玩转VR虚拟世界","directorName":"史蒂文·斯皮尔伯格","img":"http://img5.mtime.cn/mt/2018/03/23/094042.12197321_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":true,"isNew":true,"length":140,"movieId":219107,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":55,"nearestShowDay":1522396800,"nearestShowtimeCount":737},"preferentialFlag":false,"rDay":30,"rMonth":3,"rYear":2018,"ratingFinal":8.7,"titleCn":"头号玩家","titleEn":"Ready Player One","type":"动作 / 冒险 / 科幻","wantedCount":2308},{"actorName1":"约翰·波耶加","actorName2":"斯科特·伊斯特伍德","btnText":"","commonSpecial":"怪兽卷土重来人类团结救世","directorName":"斯蒂文·S·迪奈特","img":"http://img5.mtime.cn/mt/2018/02/08/093354.92447039_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":111,"movieId":195922,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":54,"nearestShowDay":1522396800,"nearestShowtimeCount":335},"preferentialFlag":false,"rDay":23,"rMonth":3,"rYear":2018,"ratingFinal":6.9,"titleCn":"环太平洋：雷霆再起","titleEn":"Pacific Rim: Uprising","type":"动作 / 冒险 / 科幻","wantedCount":7485},{"actorName1":"连姆·尼森","actorName2":"维拉·法梅加","btnText":"","commonSpecial":"连姆·尼森为家人搏命拼死一战","directorName":"佐米·希尔拉","img":"http://img5.mtime.cn/mt/2018/03/06/184322.13611473_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":104,"movieId":228617,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":54,"nearestShowDay":1522396800,"nearestShowtimeCount":295},"preferentialFlag":false,"rDay":30,"rMonth":3,"rYear":2018,"ratingFinal":7.8,"titleCn":"通勤营救","titleEn":"The Commuter","type":"犯罪 / 剧情 / 悬疑","wantedCount":887},{"actorName1":"阿格莱亚·塔拉索娃","actorName2":"亚历山大·佩特洛夫","btnText":"","commonSpecial":"","directorName":"奥列格·特罗费姆","img":"http://img5.mtime.cn/mt/2018/03/27/112828.40248818_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":89,"movieId":251853,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":52,"nearestShowDay":1522396800,"nearestShowtimeCount":204},"preferentialFlag":false,"rDay":30,"rMonth":3,"rYear":2018,"ratingFinal":-1,"titleCn":"花滑女王","titleEn":"Ice","type":"剧情 / 歌舞 / 爱情","wantedCount":123},{"actorName1":"白客","actorName2":"蓝盈莹","btnText":"","commonSpecial":"顾长卫群像描绘怀旧青春","directorName":"顾长卫","img":"http://img5.mtime.cn/mt/2018/03/12/143343.40016718_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":99,"movieId":247007,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":41,"nearestShowDay":1522396800,"nearestShowtimeCount":138},"preferentialFlag":false,"rDay":29,"rMonth":3,"rYear":2018,"ratingFinal":6.6,"titleCn":"遇见你真好","titleEn":"Nice To Meet You","type":"爱情 / 剧情 / 喜剧","wantedCount":4344},{"actorName1":"小沈阳","actorName2":"陈意涵","btnText":"","commonSpecial":"小沈阳异想天开\u201c变脸\u201d国际名人","directorName":"刘仪伟","img":"http://img5.mtime.cn/mt/2018/03/09/104554.85993469_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":99,"movieId":234611,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":43,"nearestShowDay":1522396800,"nearestShowtimeCount":141},"preferentialFlag":false,"rDay":30,"rMonth":3,"rYear":2018,"ratingFinal":-1,"titleCn":"我说的都是真的","titleEn":"Really?","type":"喜剧","wantedCount":1408},{"actorName1":"艾丽西亚·维坎德","actorName2":"吴彦祖","btnText":"","commonSpecial":"坎妹吴彦祖高颜值探险二人组开打","directorName":"罗阿尔·乌索格","img":"http://img5.mtime.cn/mt/2018/02/24/120406.34154207_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":118,"movieId":108482,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":33,"nearestShowDay":1522396800,"nearestShowtimeCount":62},"preferentialFlag":false,"rDay":16,"rMonth":3,"rYear":2018,"ratingFinal":6.8,"titleCn":"古墓丽影：源起之战","titleEn":"Tomb Raider","type":"动作 / 冒险","wantedCount":4006},{"actorName1":"","actorName2":"","btnText":"","commonSpecial":"讲述中国故事，刻画中国面貌","directorName":"卫铁","img":"http://img5.mtime.cn/mt/2018/02/22/142010.67656990_1280X720X2.jpg","is3D":false,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":90,"movieId":254741,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":28,"nearestShowDay":1522396800,"nearestShowtimeCount":55},"preferentialFlag":false,"rDay":2,"rMonth":3,"rYear":2018,"ratingFinal":-1,"titleCn":"厉害了，我的国","titleEn":"Amazing China","type":"纪录片","wantedCount":543},{"actorName1":"姜武","actorName2":"宋洋","btnText":"","commonSpecial":"","directorName":"忻钰坤","img":"http://img5.mtime.cn/mt/2018/03/09/093521.75186412_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":120,"movieId":234616,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":24,"nearestShowDay":1522828800,"nearestShowtimeCount":92},"preferentialFlag":false,"rDay":4,"rMonth":4,"rYear":2018,"ratingFinal":-1,"titleCn":"暴裂无声","titleEn":"Wrath Of Silence","type":"犯罪 / 剧情 / 悬疑","wantedCount":570},{"actorName1":"张若昀","actorName2":"马思纯","btnText":"","commonSpecial":"","directorName":"李洋","img":"http://img5.mtime.cn/mt/2018/03/29/155558.44996783_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":0,"movieId":228703,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":1,"nearestShowDay":1522742400,"nearestShowtimeCount":1},"preferentialFlag":false,"rDay":4,"rMonth":4,"rYear":2018,"ratingFinal":-1,"titleCn":"奇葩朵朵","titleEn":"Nuts","type":"爱情 / 剧情","wantedCount":80},{"actorName1":"凯特林·马希尔","actorName2":"卡拉·希门尼斯","btnText":"","commonSpecial":"","directorName":"罗伯特·文斯","img":"http://img5.mtime.cn/mt/2018/02/02/093333.47009979_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":92,"movieId":254483,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":9,"nearestShowDay":1522396800,"nearestShowtimeCount":11},"preferentialFlag":false,"rDay":24,"rMonth":3,"rYear":2018,"ratingFinal":-1,"titleCn":"萌犬好声音","titleEn":"Pup Star","type":"家庭 / 冒险 / 喜剧","wantedCount":143},{"actorName1":"萨尔曼·汗","actorName2":"卡琳娜·卡普","btnText":"","commonSpecial":"印度神作之大叔帮萝莉寻家","directorName":"卡比尔·汗","img":"http://img5.mtime.cn/mt/2018/01/18/201608.81277397_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":140,"movieId":228764,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":15,"nearestShowDay":1522396800,"nearestShowtimeCount":30},"preferentialFlag":false,"rDay":2,"rMonth":3,"rYear":2018,"ratingFinal":8.1,"titleCn":"小萝莉的猴神大叔","titleEn":"Bajrangi Bhaijaan","type":"剧情","wantedCount":916},{"actorName1":"张译","actorName2":"黄景瑜","btnText":"","commonSpecial":"\"蛟龙突击队\"演绎神兵天降","directorName":"林超贤","img":"http://img5.mtime.cn/mt/2018/02/17/150049.57218452_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":138,"movieId":240425,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":16,"nearestShowDay":1522396800,"nearestShowtimeCount":26},"preferentialFlag":false,"rDay":16,"rMonth":2,"rYear":2018,"ratingFinal":8.1,"titleCn":"红海行动","titleEn":"Operation Red Sea","type":"动作 / 剧情","wantedCount":3451},{"actorName1":"伊尔凡·可汗","actorName2":"萨巴·卡玛尔","btnText":"","commonSpecial":"","directorName":"萨基特·乔杜里","img":"http://img5.mtime.cn/mt/2018/03/19/225436.56140387_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":132,"movieId":251494,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":3,"nearestShowDay":1522483200,"nearestShowtimeCount":3},"preferentialFlag":false,"rDay":4,"rMonth":4,"rYear":2018,"ratingFinal":8,"titleCn":"起跑线","titleEn":"Hindi Medium","type":"剧情 / 喜剧","wantedCount":352},{"actorName1":"福山雅治","actorName2":"役所广司","btnText":"","commonSpecial":"一部真相不被揭露的法庭电影","directorName":"是枝裕和","img":"http://img5.mtime.cn/mt/2018/03/20/093607.70913422_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":124,"movieId":240946,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":12,"nearestShowDay":1522396800,"nearestShowtimeCount":36},"preferentialFlag":false,"rDay":30,"rMonth":3,"rYear":2018,"ratingFinal":7,"titleCn":"第三度嫌疑人","titleEn":"The Third Murder","type":"剧情 / 悬疑","wantedCount":230}]
     * totalCinemaCount : 93
     * totalComingMovie : 34
     * totalHotMovie : 37
     */

    public int count;
    public int totalCinemaCount;
    public int totalComingMovie;
    public int totalHotMovie;
    public List<MoviesBean> movies;

    public static class MoviesBean {
        /**
         * actorName1 : 泰尔·谢里丹
         * actorName2 : 奥利维亚·库克
         * btnText :
         * commonSpecial : 斯皮尔伯格玩转VR虚拟世界
         * directorName : 史蒂文·斯皮尔伯格
         * img : http://img5.mtime.cn/mt/2018/03/23/094042.12197321_1280X720X2.jpg
         * is3D : true
         * isDMAX : true
         * isFilter : false
         * isHot : true
         * isIMAX : false
         * isIMAX3D : true
         * isNew : true
         * length : 140
         * movieId : 219107
         * nearestShowtime : {"isTicket":true,"nearestCinemaCount":55,"nearestShowDay":1522396800,"nearestShowtimeCount":737}
         * preferentialFlag : false
         * rDay : 30
         * rMonth : 3
         * rYear : 2018
         * ratingFinal : 8.7
         * titleCn : 头号玩家
         * titleEn : Ready Player One
         * type : 动作 / 冒险 / 科幻
         * wantedCount : 2308
         */

        public String actorName1;
        public String actorName2;
        public String btnText;
        public String commonSpecial;
        public String directorName;
        public String img;
        public boolean is3D;
        public boolean isDMAX;
        public boolean isFilter;
        public boolean isHot;
        public boolean isIMAX;
        public boolean isIMAX3D;
        public boolean isNew;
        public int length;
        public int movieId;
        public NearestShowtimeBean nearestShowtime;
        public boolean preferentialFlag;
        public int rDay;
        public int rMonth;
        public int rYear;
        public double ratingFinal;
        public String titleCn;
        public String titleEn;
        public String type;
        public int wantedCount;

        public static class NearestShowtimeBean {
            /**
             * isTicket : true
             * nearestCinemaCount : 55
             * nearestShowDay : 1522396800
             * nearestShowtimeCount : 737
             */

            public boolean isTicket;
            public int nearestCinemaCount;
            public int nearestShowDay;
            public int nearestShowtimeCount;
        }
    }
}
