package me.jeeson.android.samples.dagger2.arch.base.mvp.base;


import me.jeeson.android.samples.dagger2.arch.base.mvp.IModel;
import me.jeeson.android.samples.dagger2.arch.base.mvp.IPresenter;
import me.jeeson.android.samples.dagger2.arch.base.mvp.IView;

public class BasePresenter<M extends IModel, V extends IView>  implements IPresenter {
    protected final String TAG = this.getClass().getSimpleName();
    protected M mModel;
    protected V mRootView;

    public BasePresenter(M model, V rootView) {
        this.mModel = model;
        this.mRootView = rootView;
        onStart();
    }

    public BasePresenter(V rootView) {
        this.mRootView = rootView;
        onStart();
    }

    public BasePresenter(M model) {
        this.mModel = model;
        onStart();
    }

    public BasePresenter() {
        onStart();
    }


    @Override
    public void onStart() {
    }

    @Override
    public void onDestroy() {
        if (mModel != null)
            mModel.onDestroy();
        this.mModel = null;
        this.mRootView = null;
    }
}
