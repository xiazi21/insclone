package com.example.insclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("k8NqMnKCTPkff0RGPTYqXTD7ywHLaKiwO1JoMqrM")
                .clientKey("PzRsDcsWhKKpLjRdbwbxdkr1E8FUDtCnZaNv0Eim")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
