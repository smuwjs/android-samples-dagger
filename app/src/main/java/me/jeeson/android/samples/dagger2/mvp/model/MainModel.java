package me.jeeson.android.samples.dagger2.mvp.model;

import android.util.Log;

import javax.inject.Inject;

import me.jeeson.android.samples.dagger2.arch.base.di.scope.ActivityScope;
import me.jeeson.android.samples.dagger2.arch.base.mvp.base.BaseModel;
import me.jeeson.android.samples.dagger2.mvp.contract.MainContract;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/9/7 10:32
 */
@ActivityScope
public class MainModel extends BaseModel implements MainContract.Model{

    @Inject
    MainModel() {
    }

    @Override
    public void testModel() {
        Log.d("test Model","test Model");
    }
}
