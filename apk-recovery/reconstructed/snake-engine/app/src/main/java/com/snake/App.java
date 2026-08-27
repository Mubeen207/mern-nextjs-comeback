package com.snake;

import android.app.Application;
import android.content.Context;

/**
 * Main application class for Snake Engine
 * Initializes the application and loads native libraries
 */
public class App extends Application {
    public static Context applicationContext;

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        applicationContext = context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Firebase and other components
        initializeComponents();
    }

    /**
     * Initialize application components
     */
    private void initializeComponents() {
        // The original APK loads libengine.so here. The recovered native binary
        // is documented separately and is intentionally optional in this shell.
    }
}
