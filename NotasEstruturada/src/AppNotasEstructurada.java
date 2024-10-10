import javax.swing.JOptionPane;

public class AppNotasEstructurada {
    
    public static void main(String[] args) throws Exception {
        
        for (int est =0; est < 2; est++){

            String nombre =JOptionPane.showInputDialog(null, "ingresar el nombre del Estudiante");

            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la nota uno"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la nota dos"));
            float nota_final= (nota1+nota2)/2;

            JOptionPane.showMessageDialog(null,"informacion Del estudiante:" +nombre+ "Nota Final:"+nota_final );
            if (nota_final< 3){
                JOptionPane.showMessageDialog(null,"El Estudiantes "+nombre+ " Reprueba");
            }
            else{
                JOptionPane.showMessageDialog(null,"El Estudiantes "+nombre+ "  Aprueba");
            }




        }
    }
}
