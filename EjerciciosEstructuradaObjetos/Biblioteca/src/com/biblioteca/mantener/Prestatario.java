package com.biblioteca.mantener;

public class Prestatario  extends General{
    private String dirrecion;
    private String telefono, ruc;
    private Cuidad cuidad;

    public Prestatario(){

    }

    public Prestatario(int codigo, String nombre, String dirrecion, String telefono, String ruc, Cuidad cuidad){
        super(codigo,nombre);
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.ruc= ruc;
        this.cuidad =cuidad;
    }

    public void setDirrecion(String direccion){
        this.dirrecion=direccion;
    }
    public String getDirrecion (){
        return dirrecion;
    }
    public void settelefono(String telefono){
        this.telefono=telefono;

    }
    public String gettelefono(){
        return telefono;
    }

    public void setruc(String ruc){
        this.ruc=ruc;
    }
    public String getruc(){
        return ruc;
    }

    public void setcuidad(Cuidad cuidad){
        this.cuidad= cuidad;
    }

    public Cuidad getcuidad(){
        return cuidad;
    }
    public String toString(){
        return "Prestatario{"+ super.toString() + " Dirreccion: "+dirrecion + " Telefono: " + telefono +
        " Ruc: " + ruc + " Cuidad: " + cuidad +"}";
    }
}
   