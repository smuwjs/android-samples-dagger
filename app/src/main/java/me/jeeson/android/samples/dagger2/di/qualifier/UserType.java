package me.jeeson.android.samples.dagger2.di.qualifier;

import android.support.annotation.StringDef;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @Description:
 * @Anthor: Jeeson
 * @Time: 2017/7/5 16:57
 */

@Qualifier
@Documented
@StringDef({
        UserType.NAME,
        UserType.AGE
})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserType {

    String value() default "";

    String NAME = "name";
    String AGE = "age";
}
