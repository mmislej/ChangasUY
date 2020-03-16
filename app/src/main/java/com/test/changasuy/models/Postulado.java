package com.test.changasuy.models;

import org.jetbrains.annotations.NotNull;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Postulado extends RealmObject {

    @PrimaryKey
    private int id;
    private boolean postuladoSi;

    private RealmList<Trabajo> trabajos;

    public Postulado(){

    }

    public Postulado(Boolean postuladoSi){
        this.id = 0;
        this.postuladoSi = false;
        this.trabajos = new RealmList<Trabajo>();
    }

    public int getId() {
        return id;
    }

    public boolean isPostuladoSi() {
        return postuladoSi;
    }

    public void setPostuladoSi(boolean postuladoSi) {
        this.postuladoSi = postuladoSi;
    }

    public RealmList<Trabajo> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(RealmList<Trabajo> trabajos) {
        this.trabajos = trabajos;
    }
}
