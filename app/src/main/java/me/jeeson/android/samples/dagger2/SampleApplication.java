package me.jeeson.android.samples.dagger2;

import me.jeeson.android.samples.dagger2.base.BaseApplication;
import me.jeeson.android.samples.dagger2.di.component.AppComponent;
import me.jeeson.android.samples.dagger2.di.component.DaggerAppComponent;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/6 9:55
 */
public class SampleApplication extends BaseApplication {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder()
                .baseAppComponent(getBaseAppComponent())
                .build();
        appComponent
                .inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
