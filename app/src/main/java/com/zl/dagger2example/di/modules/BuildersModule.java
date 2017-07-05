package com.zl.dagger2example.di.modules;

import android.app.Activity;

import com.zl.dagger2example.di.components.MainComponent;
import com.zl.dagger2example.di.scopes.ActivityScope;
import com.zl.dagger2example.ui.ContributesActivity;
import com.zl.dagger2example.ui.MainActivity;
import com.zl.dagger2example.ui.UserActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * 作者：Jeeson on 2017/6/9 11:16
 */
@Module(subcomponents = {MainComponent.class})
public abstract class BuildersModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainComponent.Builder builder);
//
//    @Binds
//    @IntoMap
//    @ActivityKey(UserActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindSecondActivityInjectorFactory(UserComponent.Builder builder);


    @ActivityScope
    @ContributesAndroidInjector(modules = UserModule.class)
    abstract UserActivity contributeSecondActivityInjector();

    @ActivityScope
    @ContributesAndroidInjector
    abstract ContributesActivity contributeActivityInjector();
}
