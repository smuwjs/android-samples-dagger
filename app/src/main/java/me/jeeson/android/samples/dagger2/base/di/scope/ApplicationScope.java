package me.jeeson.android.samples.dagger2.base.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/10 13:00
 */
@Scope
@Retention(RUNTIME)
public @interface ApplicationScope {
}
