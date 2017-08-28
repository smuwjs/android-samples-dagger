package me.jeeson.android.samples.dagger2.arch.base;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import me.jeeson.android.samples.dagger2.arch.base.di.component.BaseAppComponent;
import me.jeeson.android.samples.dagger2.arch.base.di.component.DaggerBaseAppComponent;
import me.jeeson.android.samples.dagger2.arch.base.di.module.AppModule;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:33
 */
public class BaseApplication  extends Application implements HasActivityInjector {


    @Inject
    DispatchingAndroidInjector<Activity> mDispatchingAndroidInjector;//Dagger.Android注入

    private BaseAppComponent baseAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        baseAppComponent = DaggerBaseAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
        baseAppComponent.inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return this.mDispatchingAndroidInjector;
    }

    public BaseAppComponent getBaseAppComponent() {
        return baseAppComponent;
    }
}
