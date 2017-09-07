package me.jeeson.android.samples.dagger2.arch.base.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import me.jeeson.android.samples.dagger2.arch.base.base.BaseActivity;
import me.jeeson.android.samples.dagger2.arch.base.mvp.IView;

public abstract class BaseMvpActivity<P extends BasePresenter> extends BaseActivity implements IView {

    @Inject
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter.setmRootView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.onDestroy();
    }
}
