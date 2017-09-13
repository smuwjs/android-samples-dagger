package me.jeeson.android.samples.dagger2.mvp.presenter;

import android.util.Log;

import javax.inject.Inject;

import me.jeeson.android.samples.dagger2.arch.base.di.scope.ActivityScope;
import me.jeeson.android.samples.dagger2.arch.base.mvp.base.BasePresenter;
import me.jeeson.android.samples.dagger2.mvp.contract.MainContract;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/9/7 10:31
 */
@ActivityScope
public class MainPresenter extends BasePresenter<MainContract.Model, MainContract.View> {

    @Inject
    public MainPresenter(MainContract.Model model, MainContract.View view) {
        super(model, view);
    }

    public void testPresenter() {
        Log.d("test Presenter","testPresenter");
        mModel.testModel();
    }
}
