package com.zl.dagger2example.di.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Jeeson on 2016/1/26.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface User {
}