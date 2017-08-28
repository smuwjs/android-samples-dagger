package me.jeeson.android.samples.dagger2.arch.base.di.module;

import android.app.Application;


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

    private Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}
