package me.jeeson.android.samples.dagger2.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.jeeson.android.samples.dagger2.base.di.scope.ActivityScope;
import me.jeeson.android.samples.dagger2.ui.MainActivity;
import me.jeeson.android.samples.dagger2.ui.MainFragent;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/8/28 9:04
 */
@Module
public abstract class MainActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainFragent mainFragent();
}
