package com.project.android.dagger.components;

import com.project.android.App;
import com.project.android.ui.activity.BaseActivity;
import com.project.android.dagger.modules.AppModule;
import com.project.android.dagger.modules.InteractorsModule;

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
    void inject(App app);

    void inject(BaseActivity activity);
}