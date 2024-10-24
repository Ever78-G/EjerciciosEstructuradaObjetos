package com.biblioteca.mantener;

public class Libro extends General {
    private int edicion;
    private int añoPublicacion;
    private Autor autor;

    public Libro(){

    }
    public Libro(int edicion, int añoPublicacio, Autor autor, int codigo , String nombre){
        super(codigo,nombre);
        this.edicion= edicion;
        this.añoPublicacion = añoPublicacio;
        this.autor = autor;
    }
    
    public void setEdicion(int edicion){
        this.edicion=edicion;
    }
    public int getEdicion(){
        return edicion;
    }
    public void setAñoPublicacion(int añoPublicacion){
        this.añoPublicacion=añoPublicacion;
    }
    public int getAñoPublicacion(){
        return añoPublicacion;
    }
    public void setautor(Autor autor){
        this.autor= autor;
    }
    public Autor getAutor(){
        return autor;
    }
    public String toString() {
        return "Libro {" +super.toString()+ "Edicion " + edicion + ", año publicacion  " + añoPublicacion + ", autor " + autor  + '}';
    }
    
}
