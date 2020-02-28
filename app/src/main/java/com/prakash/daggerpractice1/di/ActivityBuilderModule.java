package com.prakash.daggerpractice1.di;

import com.prakash.daggerpractice1.AuthActivity;

import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

public abstract class ActivityBuilderModule  {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString(){
        return "this is a string";
    }
}
