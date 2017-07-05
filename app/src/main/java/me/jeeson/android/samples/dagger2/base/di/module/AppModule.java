package me.jeeson.android.samples.dagger2.base.di.module;

import android.app.Application;
import android.content.Context;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:40
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }
}
