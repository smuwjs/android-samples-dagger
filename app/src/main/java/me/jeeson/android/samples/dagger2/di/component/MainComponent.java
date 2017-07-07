package me.jeeson.android.samples.dagger2.di.component;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import me.jeeson.android.samples.dagger2.base.di.component.BaseAppComponent;
import me.jeeson.android.samples.dagger2.base.di.scope.ActivityScope;
import me.jeeson.android.samples.dagger2.di.module.MainModule;
import me.jeeson.android.samples.dagger2.ui.MainActivity;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/6 11:22
 */
@ActivityScope
@Component(modules = {
        MainModule.class,
        AndroidSupportInjectionModule.class
},dependencies = {
        BaseAppComponent.class
})
public interface AppComponent extends AndroidInjector<MainActivity>{

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

        @Override
        public void seedInstance(MainActivity instance) {
        }

        abstract void setBaseAppComponent(BaseAppComponent baseAppComponent);
    }
}
