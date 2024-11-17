package Class;


public class Empleado {
    private  String nombre;
    private double salario;
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }

    public void  setnombre(String nombree){
        this.nombre= nombree;

    }


    public String getnombre(){
        return nombre;
    }
    public void  setsalario(double saliorio){
        this.salario= saliorio;

    }
    public double  getsalirio(){
        return salario;
    }



}
