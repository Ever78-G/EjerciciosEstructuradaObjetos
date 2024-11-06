package com.manager;

public class Comprobante extends Fecha {
    private String tipo;
    private int numero;
    
    public Comprobante(){

    }
    public Comprobante(String tipo, int numero, int dia, int mes, int año){
        super(dia,mes,año);
        this.tipo=tipo;
        this.numero=numero;
    }

    public void settipo(String tipo){
        this.tipo = tipo;
    }
    public String gettipo(){
        return tipo;
    }
    public void setnumero(int numero){
        this.numero= numero;
    }
    public int getnumero(){
        return numero;
    }
}
