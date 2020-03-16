package com.test.changasuy.app;

import android.annotation.SuppressLint;
import android.app.Application;

import com.test.changasuy.models.Postulado;
import com.test.changasuy.models.Trabajo;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MyApplication extends Application {


    public static AtomicInteger TrabajoID = new AtomicInteger();
    public static AtomicInteger PostuladoID = new AtomicInteger();

    @SuppressLint("MissingSuperCall")
    @Override
    public void onCreate() {
        
        Realm realm = Realm.getDefaultInstance();
        TrabajoID = getIdByTable(realm, Trabajo.class);
        PostuladoID = getIdByTable(realm, Postulado.class);
        realm.close();

    }

    private <T extends RealmObject> AtomicInteger getIdByTable(Realm realm, Class<T> anyClass){
        RealmResults<T> results = realm.where(anyClass).findAll();
        return (results.size()> 0) ? new AtomicInteger(results.max("Id").intValue()): new AtomicInteger();
    }
}
