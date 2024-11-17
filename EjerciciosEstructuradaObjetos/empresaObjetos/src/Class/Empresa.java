package Class;
import  java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;
    //constructor
    public Empresa()
    {
    empleados= new ArrayList<Empleado>();
    }
    //método que agrega empleados a la empresa
    public void contratarEmpleado(Empleado e)
    {
    empleados.add(e);
    }
    //método que obtiene el total de empleados
    public int getTotalEmpleados()
    {
    return empleados.size();
    }
    //método que muestra el nombre y salario de todos los empleados
    public void nombreSalario()
    {
    for(Empleado e:empleados)
    {
    System.out.println("Nombre: "+e.getnombre()+" Salario: "+e.getsalirio());
    }
    }
    //método que retorna el total de dinero pagado a todos los empleados
    public double getTotalSalarios()
    {
    double total=0;
    for(Empleado e:empleados)
    
    
    {
    total=total+e.getsalirio();
    }
    return total;
    }
    //método que muestra el nombre, cargo y salario del empleado que más dinero gana
    public void empleadoMayorSalario()
    {
    Empleado empMayorSalario=empleados.get(0);
    double maxSalario=empleados.get(0).getsalirio();
    for(Empleado e:empleados)
    {
    if(e.getsalirio()>maxSalario)
    {
    maxSalario=e.getsalirio();
    empMayorSalario=e;
    }
    }
    System.out.println("El empleado que mas dinero gana es ");
    System.out.print("Nombre:"+empMayorSalario.getnombre());
    System.out.println( "Salario:"+empMayorSalario.getsalirio());
    }
    //método que muestra el nombre, cargo y salario del empleado que menos dinero
    
    public void empleadoMenorSalario()
    {
    Empleado empMenorSalario=empleados.get(0);
    double menSalario=empleados.get(0).getsalirio();
    
    for(Empleado e:empleados)
    {
    if(e.getsalirio()<menSalario)
    {
    menSalario=e.getsalirio();
    empMenorSalario=e;
    }
    }
    System.out.println("El empleado que menos dinero gana es ");
    System.out.print("Nombre:"+empMenorSalario.getnombre());
    System.out.println("Salario:"+empMenorSalario.getsalirio());
    }
}