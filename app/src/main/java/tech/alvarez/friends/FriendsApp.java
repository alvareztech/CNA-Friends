package tech.alvarez.friends;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class FriendsApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Inicializar Fresco para toda la app
        Fresco.initialize(this);
    }
}
