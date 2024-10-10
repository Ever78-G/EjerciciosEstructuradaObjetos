import java.util.ArrayList;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class AppEmpresaEstructurada {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> cargos =new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();
        
        int  cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa la cantidad de empleados "));

        for (int emp = 0; emp < cantidad; emp ++){
            String nombre = JOptionPane.showInputDialog(null, "ingrese el Nombre del empleado ");
            String cargo = JOptionPane.showInputDialog("ingrese el cargo del empleado ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado "));

            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);

        }

    }
}
