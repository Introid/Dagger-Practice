package com.prakash.daggerpractice1.di;

import android.app.Application;

import com.prakash.daggerpractice1.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjection;

@Component(
        modules = {
                AndroidInjectionModule.class,
                ActivityBuilderModule.class,
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);


        AppComponent build();
    }
}
