package com.manager;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    public Fecha(){

    }
    public Fecha(int dia, int mes, int año){
        this.año=año;
        this.mes=mes;
        this.dia=dia;
    }
    public void setdia(int dia){
        this.dia=dia;
    }
    public int getdia(){
        return dia;
    }
    public void setmes(int mes){
        this.mes=mes;
    }
    public int getmes(){
        return mes;
    } 
    public void setaño(int val){
        this.año= val;
    }
    public int getaño(){
        return año;
    }
}