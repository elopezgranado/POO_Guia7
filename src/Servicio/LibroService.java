/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author A305649
 */
public class LibroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro() {
        Libro lib = new Libro();
        
        System.out.println("Ingrese el ISBN");
        lib.setIsbn(leer.next());
        System.out.println("Ingrese el título");
        lib.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        lib.setAutor(leer.next());
        System.out.println("Ingrese el número de páginas");
        lib.setNumPag(leer.nextInt());
        
        return lib;
    }
    
    public void mostrarLibro(Libro lib) {
        System.out.println("ISBN: "+lib.getIsbn());
        System.out.println("Título: "+lib.getTitulo());
        System.out.println("Autor: "+lib.getAutor());
        System.out.println("Número de páginas: "+lib.getNumPag());
    }
}
