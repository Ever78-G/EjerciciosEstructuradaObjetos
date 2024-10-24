package com.biblioteca.mantener;

public class General {
    private int codigo;
    private  String nombre;

    public General(){
    }
    public General(int codigo, String nombre){
        this.codigo =codigo;
        this.nombre = nombre;
    }
    public void setcodigo(int codigo ){
        this.codigo =codigo;
    }
    public int getcodigo(){
        return codigo;
    }
    public void setnombre(String nombre ){
        this.nombre = nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public boolean validateData(){
        return true;            
    }
    public String toString(){
        return "General";
    }

}
