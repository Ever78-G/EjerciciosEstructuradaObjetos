import com.manger.*;

public class Personas {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.setName("Pepe");
        p.setAge(25);

        Stude e = new Stude();
        e.setName("Juan Giraldo");
        e.setFile(123);
        e.setMajor("Electronica");

        Profesor pro = new Profesor();
        pro.setName("Ever");
        pro.setCourse("Ingles");
        pro.setName("Conserge");

        System.out.println("Objeto p de tipo Persona");
        System.out.printf("Nombre: %s, Edad: %d \n", p.getName(), p.getAge());
        System.out.println("Objeto e de tipo Estudiante");
        System.out.printf("Nombre: %s, Carrera: %s, Codigo: %d \n", e.getName(), e.getMajor(), e.getFile());
        System.out.println("Objeto pro de tipo Profesor");
        System.out.printf("Nombre: %s, Materia: %s, Cargo: %s \n", pro.getName(), pro.getCourse(), pro.getPosition());
    }
}
