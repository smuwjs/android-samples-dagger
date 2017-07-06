package me.jeeson.android.samples.dagger2.base;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import me.jeeson.android.samples.dagger2.base.di.component.DaggerBaseAppComponent;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:33
 */
public class BaseApplication  extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerBaseAppComponent.builder().create(this);
    }
}
