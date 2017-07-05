package me.jeeson.android.samples.dagger2.base.di.module;


import com.zl.dagger2example.di.scopes.ActivityScope;

import dagger.Module;

import dagger.android.ContributesAndroidInjector;

import me.jeeson.android.samples.dagger2.di.module.MainModule;
import me.jeeson.android.samples.dagger2.ui.MainActivity;


/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 17:16
 */
@Module
public abstract class BuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivityInjector();

}
