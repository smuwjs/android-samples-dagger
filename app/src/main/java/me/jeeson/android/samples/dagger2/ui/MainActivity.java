package me.jeeson.android.samples.dagger2.ui;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;


import javax.inject.Inject;

import me.jeeson.android.samples.dagger2.R;
import me.jeeson.android.samples.dagger2.arch.base.BaseActivity;
import me.jeeson.android.samples.dagger2.bean.User;
import me.jeeson.android.samples.dagger2.di.qualifier.UserType;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:53
 */
public class MainActivity extends BaseActivity {

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
    }
}
