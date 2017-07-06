package me.jeeson.android.samples.dagger2;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import me.jeeson.android.samples.dagger2.di.component.DaggerAppComponent;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/6 9:55
 */
public class SampleApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
