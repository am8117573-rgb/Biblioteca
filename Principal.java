
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Metodos M = new Metodos();
        System.out.println("Cuantos libros desea registrar? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer despues del nextInt()
        ObjBiblioteca[] libros = new ObjBiblioteca[n];
        libros = M.LlenarLibros(libros);
        M.MostrarLibroMayorValor(libros);
    }
}