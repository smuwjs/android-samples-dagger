package me.jeeson.android.samples.dagger2.di.component;


import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import me.jeeson.android.samples.dagger2.SampleApplication;
import me.jeeson.android.samples.dagger2.di.module.BuilderModule;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/6 11:22
 */
@Singleton
@Component(modules = {
        BuilderModule.class,
        AndroidSupportInjectionModule.class
})
public interface AppComponent extends AndroidInjector<SampleApplication>{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<SampleApplication> {}
}
