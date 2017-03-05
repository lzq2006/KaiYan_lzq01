package com.example.jp.kaiyan_lzq01;

/**
 * Created by jp on 2017/3/5.
 */

/**
 * 常量类
 * Created by Administrator on 2016/12/6.
 */

public class Constants {


    //广告界面
    public static final String LOADING = "http://adse.ximalaya.com/ting/loading?appid=0&device=android&name=loading&network=wifi&operator=0&version=4.3.98";


    public static final String SERVICE_HOST="http://mobile.ximalaya.com";
    //    1.推荐  discover_recommend
//    推荐主体数据接口：
//    http://mobile.ximalaya.com/mobile/discovery/v1/recommends?channel=and-f6&device=android&includeActivity=true&includeSpecial=true&scale=2&version=4.1.7.1;
    public static final String RECOMMEND_MAIN = SERVICE_HOST+"/mobile/discovery/v1/recommends?channel=and-f6&device=android&includeActivity=true&includeSpecial=true&scale=2&version=4.1.7.1";

    //
//    推荐底部广告
//    http://ad.ximalaya.com/ting?version=4.1.7.1&name=find_banner&device=android;
    public static final String RECOMMEND_FOOT = "http://ad.ximalaya.com/ting?version=4.1.7.1&name=find_banner&device=android";

    //分类主体数据接口
    public static final String CATEGORY_MAIN = SERVICE_HOST+"/mobile/discovery/v1/categories?channel=and-a1&device=android&picVersion=13&scale=2";
    //分类足广告数据接口
    public static final String CATEGORY_FOOT = "http://adse.ximalaya.com/ting?device=android&name=cata_index_banner&network=wifi&operator=0&version=4.3.98";

    //榜单主体数据接口
    public static final String RATING_MAIN = SERVICE_HOST + "/mobile/discovery/v2/rankingList/group?channel=and-a1&device=android&includeActivity=true&includeSpecial=true&scale=2&version=4.3.98";

    //主播主体数据接口
    public static final String ANCHOR_MAIN = SERVICE_HOST+"/m/explore_user_index?device=android&page=";

    //广播主体数据接口
    public static final String BROADCAST_MAIN = "http://live.ximalaya.com/live-web/v4/homepage";
}
