package me.jeeson.android.samples.dagger2.di.module;


import dagger.Module;
import dagger.Provides;

import me.jeeson.android.samples.dagger2.arch.base.di.scope.ActivityScope;
import me.jeeson.android.samples.dagger2.bean.User;
import me.jeeson.android.samples.dagger2.di.qualifier.UserType;
import me.jeeson.android.samples.dagger2.mvp.contract.MainContract;
import me.jeeson.android.samples.dagger2.mvp.model.MainModel;
import me.jeeson.android.samples.dagger2.mvp.ui.MainActivity;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:57
 */

@Module
public class MainModule {

    @ActivityScope
    @UserType(UserType.NAME)
    @Provides
    User provideUserName() {
        return new User("Jeeson");
    }

    @ActivityScope
    @UserType(UserType.AGE)
    @Provides
    User provideUserAge() {
        return new User(23);
    }

    @ActivityScope
    @Provides
    MainContract.Model provideMainModel(MainModel model) {
        return model;
    }

    @ActivityScope
    @Provides
    MainContract.View provideMainView(MainActivity mainActivity) {
        return mainActivity;
    }
}
