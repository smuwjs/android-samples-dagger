package me.jeeson.android.samples.dagger2.di.module;


import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import me.jeeson.android.samples.dagger2.base.di.scope.ActivityScope;
import me.jeeson.android.samples.dagger2.bean.User;
import me.jeeson.android.samples.dagger2.di.qualifier.UserType;

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

}
