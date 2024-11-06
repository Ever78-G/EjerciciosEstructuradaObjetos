package com.manager;

public class Producto {
    private int codigo;
    private String descripcion ;
    private float precion;

    public Producto(){

    }
    public Producto(int codigo, String descrip, float precio){
        this.precion= precio;
        this.codigo = codigo;
        this.descripcion= descrip;
    }
    public void setcodigo( int val){
        this.codigo= val;
    }
    public int getcodigo(){
        return codigo;
    }
    public void setdescripcion(String descrip){
        this.descripcion= descrip;

    }
    public String getdescripcion(){
        return descripcion;
    }
    public  void setprecio(float pre){
        this.precion= pre;
    }
    public float getprecion(){
        return precion;
    }

}
