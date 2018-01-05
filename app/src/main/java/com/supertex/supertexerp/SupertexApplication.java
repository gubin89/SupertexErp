package com.supertex.supertexerp;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2018-01-04.
 */

public class SupertexApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);//初始化XUtils
        x.Ext.setDebug(BuildConfig.DEBUG);//是否输出debug日志
    }
}
