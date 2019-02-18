package com.example.module_user;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class UserApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
}
