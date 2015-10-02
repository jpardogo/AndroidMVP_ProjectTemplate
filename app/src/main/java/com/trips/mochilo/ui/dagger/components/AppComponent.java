package com.trips.mochilo.ui.dagger.components;

import com.trips.mochilo.Mochilo;
import com.trips.mochilo.ui.activity.BaseActivity;
import com.trips.mochilo.ui.dagger.modules.AppModule;
import com.trips.mochilo.ui.dagger.modules.InteractorsModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                InteractorsModule.class,
        }
)
public interface AppComponent {
    void inject(Mochilo app);

    void inject(BaseActivity activity);
}