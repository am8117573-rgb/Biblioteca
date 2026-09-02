
import java.util.Scanner;

public class Metodos{

    public ObjBiblioteca[] LlenarLibros(ObjBiblioteca[] libros) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < libros.length; i++) {
            ObjBiblioteca l = new ObjBiblioteca();
            System.out.println("\nTitulo: ");
            l.setTitulo(sc.nextLine());
            System.out.println("Autor: ");
            l.setAutor(sc.nextLine());
            System.out.println("Año de publicacion: ");
            l.setAnioPublicacion(sc.nextInt());
            System.out.println("Precio: ");
            l.setPrecio(sc.nextDouble());
            sc.nextLine(); // limpiar buffer antes del siguiente nextLine()
            libros[i] = l;
        }
        return libros;
    }

    public void MostrarLibroMayorValor(ObjBiblioteca[] libros) {
        ObjBiblioteca mayor = libros[0];
        for (int i = 1; i < libros.length; i++) {
            if (libros[i].getPrecio() > mayor.getPrecio()) {
                mayor = libros[i];
            }
        }
        System.out.println("\n=== LIBRO DE MAYOR VALOR ECONOMICO ===");
        System.out.println("Titulo: " + mayor.getTitulo());
        System.out.println("Autor: " + mayor.getAutor());
        System.out.println("Año de publicacion: " + mayor.getAnioPublicacion());
        System.out.println("Precio: " + mayor.getPrecio());
    }
}