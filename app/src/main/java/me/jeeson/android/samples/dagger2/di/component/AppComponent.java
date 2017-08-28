package me.jeeson.android.samples.dagger2.di.component;

import dagger.Component;

import me.jeeson.android.samples.dagger2.SampleApplication;
import me.jeeson.android.samples.dagger2.base.di.component.BaseAppComponent;;
import me.jeeson.android.samples.dagger2.base.di.scope.ApplicationScope;
import me.jeeson.android.samples.dagger2.di.module.MainActivityModule;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/6 11:22
 */
@ApplicationScope
@Component(modules = {
        MainActivityModule.class
        }, dependencies =  {
        BaseAppComponent.class
})
public interface AppComponent{

    void inject(SampleApplication sampleApplication);
}
