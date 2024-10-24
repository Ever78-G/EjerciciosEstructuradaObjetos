package Class;

public class Estudiante {
    private String nombre;
    private float nota1,nota2,notaFinal;

    public Estudiante(String nombre){
        this.nombre=nombre;
    }

    public  Estudiante(String nombre , float nota1,float nota2){
        this.nombre= nombre;
        this.nota1 = nota1;
        this.nota2=nota2;
    }

    public void CalcularNotaFinal(){
        notaFinal=(nota1+nota2)/2;
    }
    public void Optnernombre(String nombre){
        this.nombre = nombre;
    }

    public String Optnernombre(){
        return nombre;
    }

    public float ObtenerNotafinal(){
        return notaFinal;
    }

    public String obtenerMesaje(){
        if (notaFinal<3) {
            return "Reprobado";
        }
        else{
            return "Aprodo";
        }
        
    }
}
