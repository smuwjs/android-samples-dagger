package com.zl.dagger2example.di.modules;

import android.content.Context;

import com.zl.dagger2example.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Jeeson on 2016/1/27.
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(MyApplication application) {
        return application;
    }
}
