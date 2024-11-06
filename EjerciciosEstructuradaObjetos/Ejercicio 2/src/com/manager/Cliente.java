package com.manager;

public class Cliente {
    private int codigo;
    private String razonsocial;

    public Cliente(){

    }
    public Cliente(int codigo, String razonsocial){
        this.codigo = codigo;
        this.razonsocial= razonsocial;

    }
    public void setcodigo(int codigo){
        this.codigo= codigo;
    }
    public int getcodigo(){
        return codigo;
    }
    public void setrazonsocial(String razon){
        this.razonsocial = razon;
    }
    public String getrazonsocial(){
        return razonsocial;
    }

}
