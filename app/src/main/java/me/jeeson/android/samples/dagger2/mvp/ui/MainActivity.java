package me.jeeson.android.samples.dagger2.mvp.ui;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;


import javax.inject.Inject;

import me.jeeson.android.samples.dagger2.R;
import me.jeeson.android.samples.dagger2.arch.base.base.BaseActivity;
import me.jeeson.android.samples.dagger2.arch.base.mvp.base.BaseMvpActivity;
import me.jeeson.android.samples.dagger2.bean.User;
import me.jeeson.android.samples.dagger2.di.qualifier.UserType;
import me.jeeson.android.samples.dagger2.mvp.contract.MainContract;
import me.jeeson.android.samples.dagger2.mvp.presenter.MainPresenter;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:53
 */
public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View{

    @UserType(UserType.NAME)
    @Inject
    User user1;

    @UserType(UserType.AGE)
    @Inject
    User user2;

    @Inject
    Application application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test Dagger",""+ (application != null));
        mPresenter.testPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
