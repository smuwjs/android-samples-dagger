package me.jeeson.android.samples.dagger2.mvp.contract;

import me.jeeson.android.samples.dagger2.arch.base.mvp.IModel;
import me.jeeson.android.samples.dagger2.arch.base.mvp.IView;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/9/7 10:32
 */
public interface MainContract {

    interface View extends IView {

    }

    interface Model extends IModel {
        void testModel();
    }
}
