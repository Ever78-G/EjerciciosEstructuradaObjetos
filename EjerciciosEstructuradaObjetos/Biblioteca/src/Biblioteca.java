import java.util.Scanner;

import com.biblioteca.mantener.*;

public class Biblioteca {
    Libro libro;

    public static void main(String[] args) throws Exception {
       Biblioteca biblioteca = new Biblioteca();
       biblioteca.cargar();
       biblioteca.imprimir();
    }
    public void cargar() {
        Scanner sc = new Scanner(System.in);
        libro = new Libro();
        System.out.println("Digite el codigo del libro:");
        libro.setcodigo(Integer.parseInt(sc.nextLine()));
        sc.nextLine();
        System.out.println("Digite el nombre del libro:");
        libro.setnombre(sc.nextLine());
        System.out.println("Digite el año de publicacion:");
        libro.setAñoPublicacion(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite la edicion:");
        libro.setEdicion(Integer.parseInt(sc.nextLine()));
        Autor autor = new Autor();
        System.out.println("Digite el codigo del autor del libro:");
        autor.setcodigo(Integer.parseInt(sc.nextLine()));
        sc.nextLine();
        System.out.println("Digite el nombre del autor del libro:");
        autor.setnombre(sc.nextLine());

        libro.setautor(autor);
        
    }

    public void imprimir() {
        System.out.println(libro);
    }
}
