package com.example.class_2102_native_ad_ith_meta;

import android.app.Application;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);
        AdSettings.addTestDevice("aed13d65-dadb-479a-8787-9549999db3e6");
    }
}
