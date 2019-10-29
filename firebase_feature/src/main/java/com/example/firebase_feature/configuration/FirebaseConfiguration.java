package com.example.firebase_feature.configuration;

import com.example.core_feature.configuration.BaseConfiguration;
import com.google.firebase.FirebaseApp;

public class FirebaseConfiguration extends BaseConfiguration {

    private static FirebaseConfiguration INSTANCE = null;

    private FirebaseConfiguration() {
        FirebaseApp.initializeApp(BaseConfiguration.getContext());
    }

    public static FirebaseConfiguration getInstance() {
        if (INSTANCE == null) {
            synchronized (FirebaseConfiguration.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FirebaseConfiguration();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public String getServiceName() {
        return FirebaseConfiguration.class.getSimpleName();
    }
}