

import javax.swing.JOptionPane;

import Class.Estudiante;


public class AppNotasObjetos {
    public static void main(String[] args) throws Exception {
        /*Estudiante est = new Estudiante("ever", Float.parseFloat("3.5"), Float.parseFloat("2.0"));
        Estudiante est1 =new Estudiante("Camilo",Float.parseFloat("3.0"),Float.parseFloat("3.0"));
        est.CalcularNotaFinal();
        est1.CalcularNotaFinal();*/

        Estudiante est;
        for(int i=0; i <2; i++){
            String nombre = JOptionPane.showInputDialog("Nombre del Estudinate");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota numero uno "));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota numero dos "));
            est = new Estudiante(nombre,nota1,nota2);
            est.CalcularNotaFinal();

            JOptionPane.showMessageDialog(null,"Es estudiante : "+est.Optnernombre()+"  Obtuvo una nota de "+est.ObtenerNotafinal()+  " El cual  "+ est.obtenerMesaje());

        }


        }
}
