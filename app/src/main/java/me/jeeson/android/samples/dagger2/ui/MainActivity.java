package me.jeeson.android.samples.dagger2.ui;

import android.os.Bundle;

import com.zl.dagger2example.R;

import javax.inject.Inject;

import me.jeeson.android.samples.dagger2.base.BaseActivity;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:53
 */
public class MainActivity extends BaseActivity {

    @Inject
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(str);
    }
}
