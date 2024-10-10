

import Class.Estudiante;


public class AppNotasObjetos {
    public static void main(String[] args) throws Exception {
        Estudiante est = new Estudiante("ever", Float.parseFloat("3.5"), Float.parseFloat("2.0"));
        Estudiante est1 =new Estudiante("Camilo",Float.parseFloat("3.0"),Float.parseFloat("3.0"));
        est.CalcularNotaFinal();
        est1.CalcularNotaFinal();
        System.out.println("Es estudiante : "+est.Optnernombre()+"  Obtuvo una nota de "+est.ObtenerNotafinal()+  " El cual  "+ est.obtenerMesaje());
        System.out.println("Es estudiante : "+est1.Optnernombre()+"  Obtuvo una nota de "+est1.ObtenerNotafinal()+  " El cual  "+ est1.obtenerMesaje());

        }
}
