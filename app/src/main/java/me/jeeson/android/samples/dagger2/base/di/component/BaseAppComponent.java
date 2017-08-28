package me.jeeson.android.samples.dagger2.base.di.component;


import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import me.jeeson.android.samples.dagger2.base.BaseApplication;
import me.jeeson.android.samples.dagger2.base.di.module.AppModule;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:37
 */

@Singleton
@Component(modules = {
        AppModule.class,
        AndroidSupportInjectionModule.class
})
public interface BaseAppComponent{

    void inject(BaseApplication baseApplication);

    Application application();
}
