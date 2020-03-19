package com.test.changasuy.models;

import android.text.Editable;

import com.test.changasuy.app.MyApplication;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Trabajo extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String  titulo = null;
    @Required
    private String descripcion= null;
    private String limiteHorario1= null;
    private String limiteHorario2= null;
    private String salario= null;
    private String fechaInicio= null;
    private String fechaFinal= null;


    public Trabajo(){

    }



    public Trabajo (String titulo, String descripcion, String limiteHorario1, String limiteHorario2,
                    String salario,String fechaInicio, String fechaFinal){
        this.id = MyApplication.TrabajoID.incrementAndGet();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.limiteHorario1 = limiteHorario1;
        this.limiteHorario2 = limiteHorario2;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }



    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLimiteHorario1() {
        return limiteHorario1;
    }

    public void setLimiteHorario1(String limiteHorario1) {
        this.limiteHorario1 = limiteHorario1;
    }

    public String getLimiteHorario2() {
        return limiteHorario2;
    }

    public void setLimiteHorario2(String limiteHorario2) {
        this.limiteHorario2 = limiteHorario2;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
