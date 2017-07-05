package me.jeeson.android.samples.dagger2.di.module;

import dagger.Module;
import dagger.Provides;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:57
 */

@Module
public class MainModule {

    @Provides
    String provideStr() {
        return new String("test");
    }
}
