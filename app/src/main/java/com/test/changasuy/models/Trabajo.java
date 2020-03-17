package com.test.changasuy.models;

import com.test.changasuy.app.MyApplication;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Trabajo extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String  titulo;
    @Required
    private String descripcion;
    private int limiteHorario1;
    private int limiteHorario2;
    private int salario;
    private Date fechaInicio;
    private Date fechaFinal;

    public Trabajo (){

    }

    public Trabajo (String titulo, String descripcion,int limiteHorario1, int limiteHorario2,
                    int salario,Date fechaInicio, Date fechaFinal){
        this.id = MyApplication.TrabajoID.incrementAndGet();
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

    public int getLimiteHorario1() {
        return limiteHorario1;
    }

    public void setLimiteHorario1(int limiteHorario1) {
        this.limiteHorario1 = limiteHorario1;
    }

    public int getLimiteHorario2() {
        return limiteHorario2;
    }

    public void setLimiteHorario2(int limiteHorario2) {
        this.limiteHorario2 = limiteHorario2;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
