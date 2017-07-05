package me.jeeson.android.samples.dagger2.di.component;


import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import me.jeeson.android.samples.dagger2.base.di.scope.ActivityScope;
import me.jeeson.android.samples.dagger2.di.module.MainModule;
import me.jeeson.android.samples.dagger2.ui.MainActivity;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:37
 */

@ActivityScope
@Subcomponent(modules = {MainModule.class})
public interface MainComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}

}

