
import Class.Empleado;
import Class.Empresa;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidad =Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cantidad de empleados"));
        Empresa empresa= new Empresa();


        for(int emp=1;emp>cantidad;emp++){
            String nombre= JOptionPane.showInputDialog(null,"Escriba el nombre del empleado");
            double salario= Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba el salario"));
            empresa.contratarEmpleado(new Empleado(nombre,salario));
        }

        }
    
        System.out.println("El número total de empleados es: " + empresa.getTotalEmpleados());
        
        // Mostrar nombres y salarios de los empleados
        System.out.println("Los nombres y salarios de los empleados son:");
        empresa.nombreSalario();
        
        // Mostrar el total de salarios pagados
        System.out.println("Total de dinero pagado a todos los empleados: " + empresa.getTotalSalarios());
        
        // Mostrar el empleado con mayor salario
        System.out.println("Empleado con mayor salario:");
        empresa.empleadoMayorSalario();
        
        // Mostrar el empleado con menor salario
        System.out.println("Empleado con menor salario:");
        empresa.empleadoMenorSalario();
 
    }

